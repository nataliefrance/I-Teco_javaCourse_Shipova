package Project_2;

public class NoteService {
    protected static void changeNoteName(Note note) {
        System.out.println("Введите новое название:");
        String name = Main.SCANNER.nextLine();
        if ("".equals(name)) {
            name = Main.SCANNER.nextLine();
        }
        note.setName(name);
    }

    protected static void changeNoteBody(Note note) {
        System.out.println("Введите новое содержание:");
        String body = Main.SCANNER.nextLine();
        if ("".equals(body)) {
            body = Main.SCANNER.nextLine();
        }
        note.setBody(body);
    }

    protected static void deleteNote(Note note) {
        Main.notes.remove(note);
    }

    protected static void createNote() {
        System.out.println("Выберите тип заметки:\n" +
                "1. Рецепты\n" +
                "2. Список дел\n" +
                "3. Список покупок");
        int input = Main.SCANNER.nextInt();
        Note note = null;

        switch (input) {
            case 1:
                note = new Recipe(Main.currentUser.getName());
                break;
            case 2:
                note = new ToDoList(Main.currentUser.getName());
                break;
            case 3:
                note = new ShoppingList(Main.currentUser.getName());
                break;
            default:
                System.out.println("Некорректный ввод");
                createNote();
        }

        System.out.println("Введите название заметки:");
        String name = Main.SCANNER.nextLine();
        if ("".equals(name)) {
            name = Main.SCANNER.nextLine();
        }
        note.setName(name);

        System.out.println("Напишите заметку:");
        String body = Main.SCANNER.nextLine();
        if ("".equals(body)) {
            body = Main.SCANNER.nextLine();
        }
        note.setBody(body);
        Main.notes.add(note);

        System.out.println("Заметка " + note.getName() + " создана.");
    }

    protected static Note searchNote() {
        System.out.println("Введите название заметки:");
        String name = Main.SCANNER.nextLine();
        if ("".equals(name)) {
            name = Main.SCANNER.nextLine();
        }
        Note resultNote = null;
        for (Note note : Main.notes) {
            if (name.equals(note.getName())) {
                resultNote = note;
                System.out.println(note);
            } //Написать проверку на null
        }
        return resultNote;
    }
}