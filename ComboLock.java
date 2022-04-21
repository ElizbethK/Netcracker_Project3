package com.netcracker.homeworks.project3;

/*------P8.1 Declare a class ComboLock that works like the combination lock in a gym locker, as shown here.
        The lock is constructed with a combination—three numbers between 0 and 39.
        The reset method resets the dial so that it points to 0.
        The turnLeft and turnRight methods turn the dial by a given number of ticks to the left or right.
        The open method attempts to open the lock. The lock opens if the user first turned it right
        to the first number in the combination, then left to the second, and then right to the third.

        public class ComboLock
        {
        . . .
        public ComboLock(int secret1, int secret2, int secret3) { . . . }
        public void reset() { . . . }
        public void turnLeft(int ticks) { . . . }
        public void turnRight(int ticks) { . . . }
        public boolean open() { . . . }
                                                                                                        }-------*/


public class ComboLock {
    private int[] combination = new int[3];
    private int[] tryingComb = new int[3];
    private int[] decision = new int[3];
    private int dial;
    private int counter;



    public ComboLock(int secret1, int secret2, int secret3) {
        combination[0] = secret1;
        combination[1] = secret2;
        combination[2] = secret3;
        dial = 0;
        counter = 0;
    }

    public void reset() {
        tryingComb[0] = tryingComb[1] = tryingComb[2] = 0;
        dial = 0;
        counter = 0;
    }

    public void turnLeft(int ticks) {
        counter++;
        dial = (dial - ticks) + 39;
        tryingComb[counter - 1] = dial;
        dial = 0;
        if (counter == 2 & tryingComb[1] == combination[1]) {
            decision[1] = 1;
        } else {
            decision[1] = 0;
            reset();
        }
    }


    public void turnRight(int ticks) {
        counter++;
        dial = dial + ticks;
        tryingComb[counter - 1] = dial;
        //turning = RIGHT;
        dial = 0;
        if (counter == 1 & tryingComb[0] == combination[0] | counter == 3 & tryingComb[2] == combination[2]) {
            decision[counter - 1] = 1;
        } else {
            decision[counter - 1] = 0;
            reset();
        }
    }


    public boolean open() {
        if (decision[0] == 1){
            if (decision[1] == 1); }
        else
            return false;
                if (decision[2] == 1){
                    System.out.println("Correct numbers. It`s unlocked");}
                else
                    return false;
        return true;
    }
}



