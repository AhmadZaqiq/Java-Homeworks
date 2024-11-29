package ahmad.zaqiq.hw;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class AhmadZaqiqHW {

    public static void main(String[] args) {

        Note n1 = new Note(1, LocalDateTime.of(2023, 5, 12, 10, 30), "My First Note", "Hi My Name is Ahmad.", new Person("Ahmad", 30, "Male"));
        Note n2 = new Note(2, LocalDateTime.of(2024, 12, 12, 10, 30), "My Second Note", "Hi My Name is Ahmad.", new Person("Ahmad", 30, "Male"));
        Note n3 = new Note(3, LocalDateTime.now(), "My Third Note", "Hi My Name is Ahmad.", new Person("Ahmad", 30, "Male"));

        NoteBook notebook1 = new NoteBook();

        notebook1.StoreNote(n1);
        notebook1.StoreNote(n2);
        notebook1.StoreNote(n3);
        System.out.println(notebook1.retriveNote(0));
        System.out.println(notebook1.retriveNote(1));
        System.out.println(notebook1.retriveNote(2));

        notebook1.deleteNoteByID(2);

        System.out.println("\n");
        System.out.println(notebook1.retriveNote(0));
        System.out.println(notebook1.retriveNote(1));
        System.out.println(notebook1.retriveNote(2));

        notebook1.deleteNoteByTitle("My Third Note");

        System.out.println("\n");
        System.out.println(notebook1.retriveNote(0));
        System.out.println(notebook1.retriveNote(1));
        System.out.println(notebook1.retriveNote(2));

        Note n4 = new Note(4, LocalDateTime.of(2014, 12, 12, 10, 30), "My Fourth Note", "Hi My Name is Ahmad.", new Person("Ahmad", 30, "Male"));
        Note n5 = new Note(5, LocalDateTime.now(), "My Fifth Note", "Hi My Name is Ahmad.", new Person("Ahmad", 30, "Male"));

        notebook1.StoreNote(n4);
        notebook1.StoreNote(n5);

        System.out.println("\n");
        System.out.println(notebook1.getNoteByDate(LocalDateTime.now()));
        System.out.println(notebook1.getNoteByDate(LocalDateTime.of(2013, 12, 12, 10, 30)));

        NoteBook notebook2 = new NoteBook();

        Note n11 = new Note(1, LocalDateTime.of(2024, 11, 22, 10, 30), "Note 1", "Body 1", new Person("Ahmad", 30, "Male"));
        Note n12 = new Note(1, LocalDateTime.of(2024, 11, 18, 10, 30), "Note 1", "Body 1", new Person("Ahmad", 30, "Male"));
        Note n13 = new Note(1, LocalDateTime.of(2024, 11, 25, 10, 30), "Note 1", "Body 1", new Person("Ahmad", 30, "Male"));

        notebook2.StoreNote(n11);
        notebook2.StoreNote(n12);
        notebook2.StoreNote(n13);

        ArrayList<String> notesFromLastWeek = notebook2.getNotesFromWeekBefore(LocalDateTime.of(2024, 11, 22, 10, 30));

        for (String note : notesFromLastWeek) {
            System.out.println(note);
        }

        System.out.println(notebook2.SearchNoteBytitle("Note 1"));
        System.out.println(notebook2.SearchNoteBytitle("Note 123"));
    }
}
