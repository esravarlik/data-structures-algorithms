package towers_of_hanoi;

public class Main {
    public static void main(String[] args) {

        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.hanoi(3, 'A', 'C', 'B');
    }
}