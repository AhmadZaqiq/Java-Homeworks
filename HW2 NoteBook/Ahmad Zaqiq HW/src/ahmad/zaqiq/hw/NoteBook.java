package ahmad.zaqiq.hw;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class NoteBook {

    ArrayList<Note> notes;

    public NoteBook() {
        notes = new ArrayList<>();
    }

    private boolean _checkIfNoteExistsById(int id) {
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).getId() == id) {
                return true;
            }
        }

        return false;
    }

    private boolean _checkIfNoteExistsByTitle(String title) {
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).getTitle().equals(title)) {
                return true;
            }
        }

        return false;
    }

    private int _getIndexByTitle(String title) {
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).getTitle().equals(title)) {
                return i;
            }
        }

        return -1;
    }

    private int _getIndexById(int id) {
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).getId() == id) {
                return i;
            }
        }

        return -1;
    }

    public void StoreNote(Note note) {
        if (!_checkIfNoteExistsById(note.getId())) {
            notes.add(note);
        }
    }

    public String retriveNote(int i) {
        if (i < 0) {
            return "this is invalid note number";
        } else if (i >= 0 && i < notes.size()) {
            return "Title: " + notes.get(i).getTitle() + "\n Body: " + notes.get(i).getBody();
        } else {
            return "this is invalid note number";
        }
    }

    public void deleteNoteByID(int id) {
        if (_checkIfNoteExistsById(id)) {
            notes.remove(_getIndexById(id));

        }
    }

    public void deleteNoteByTitle(String title) {
        if (_checkIfNoteExistsByTitle(title)) {
            notes.remove(_getIndexByTitle(title));
        }
    }

    public String getNoteByDate(LocalDateTime date) {
        for (Note note : notes) {
            if (note.getCreateDate().toLocalDate().equals(date.toLocalDate())) {
                return "Title: " + note.getTitle() + "\nBody: " + note.getBody();
            }
        }
        return "No Notes Found";
    }

    public ArrayList<String> getNotesFromWeekBefore(LocalDateTime date) {

        LocalDateTime weekBefore = date.minusDays(7);

        ArrayList<String> notesFromWeekBefore = new ArrayList<>();

        for (Note note : notes) {
            if (note.getCreateDate().isAfter(weekBefore) && note.getCreateDate().isBefore(date)) {
                notesFromWeekBefore.add("Title: " + note.getTitle() + "\nBody: " + note.getBody());
            }
        }
        return notesFromWeekBefore;
    }

    public ArrayList<LocalDateTime> getAllDates() {
        ArrayList<LocalDateTime> dates = new ArrayList<>();

        for (Note note : notes) {
            dates.add(note.getCreateDate());
        }

        return dates;
    }

    public void getAllNotesOrderedByDateASC() {
        for (int i = 0; i < notes.size() - 1; i++) {
            for (int j = 0; j < notes.size() - i - 1; j++) {
                if (notes.get(j).getCreateDate().isAfter(notes.get(j + 1).getCreateDate())) {
                    Note temp = notes.get(j);
                    notes.set(j, notes.get(j + 1));
                    notes.set(j + 1, temp);
                }
            }
        }
    }

    public String SearchNoteBytitle(String title) {
        if (_checkIfNoteExistsByTitle(title)) {
            return retriveNote(_getIndexByTitle(title));
        }

        return "No Notes With this Title";
    }

}
