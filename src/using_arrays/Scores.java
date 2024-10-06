package using_arrays;

public class Scores {
    private int maxEntries;
    private int numEntries;
    private GameEntry[] entries;

    public Scores(){
        maxEntries = 10;
        numEntries = 0;
        entries = new GameEntry[maxEntries];
    }

    public void add(GameEntry gameEntry){
        int newScore = gameEntry.getScore();
        if(numEntries == maxEntries){
            if(newScore <= entries[maxEntries - 1].getScore()) {
                return;
            }
        }else{
            numEntries++;
        }
        int i = numEntries - 2; //numEntries - 1 is the position where the new score will be inserted
        while (i >=0 && newScore > entries[i].getScore()){
            entries[i + 1] = entries[i];
            i--;
        }
        entries[i + 1] = gameEntry;
    }

    public GameEntry remove(int i) {
        if (i < 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index! ");
        }

        GameEntry e = entries[i];
        for (int j = i + 1; j < numEntries; j++) {
            entries[j - 1] = entries[j];
        }

        numEntries--;
        entries[numEntries] = null;
        return e;
    }

    public void print() {
        for (int i = 0; i < numEntries; i++) {
            System.out.println(entries[i].getName() + "\t" + entries[i].getScore());
        }
    }
}
