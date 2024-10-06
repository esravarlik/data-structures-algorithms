package towers_of_hanoi;

public class TowersOfHanoi {

    /*
    frompeg: The starting peg for the disks (e.g., A, B, or C).
    topeg: The target peg for the disks.
    auxpeg: The auxiliary peg used as a buffer.
     */

    void hanoi(int i, char fromPeg, char toPeg, char auxPeg){
        if(i == 1){
            System.out.println("Move disk 1 from peg " + fromPeg + " to peg " + toPeg);
            return;
        }

        hanoi(i-1, fromPeg, auxPeg, toPeg);

        System.out.println("Move disk " + i + " from peg " + fromPeg + " to peg " + toPeg);

        hanoi(i-1, auxPeg, toPeg, fromPeg);
    }
}
