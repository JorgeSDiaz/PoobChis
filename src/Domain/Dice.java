package Domain;

public class Dice {
    private byte value;

    /**
     * Dice constructor
     */
    public Dice(){
        roll();
    }

    /**
     * Change the value of the dice to a random one
     */
    public void roll(){
        int newvalue = (int) ((Math.random()*7) + 1);
        if (newvalue >= 1 && newvalue < 7){
            value = (byte) newvalue;
        } else {
            value = 1;
        }
    }

    /**
     * returns dice value
     * @return Dice value
     */
    public byte getValue(){
        return value;
    }
}
