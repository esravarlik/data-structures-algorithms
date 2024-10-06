package using_arrays;

public class Main {
    public static void main(String[] args) {
        Scores scores = new Scores();

        GameEntry entry0 = new GameEntry("Anna", 660);
        scores.add(entry0);

        GameEntry entry1 = new GameEntry("Rob", 750);
        scores.add(entry1);

        GameEntry entry2 = new GameEntry("Jack", 510);
        scores.add(entry2);

        GameEntry entry3 = new GameEntry("Mike", 1105);
        scores.add(entry3);

        GameEntry entry4 = new GameEntry("Rose", 590);
        scores.add(entry4);

        GameEntry entry5 = new GameEntry("Paul", 720);
        scores.add(entry5);

        GameEntry entry6 = new GameEntry("Jill", 740);
        scores.add(entry6);

        scores.remove(3); // remove Paul

        scores.print();
    }
}
