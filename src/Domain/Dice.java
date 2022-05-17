package Domain;

public class Dice {
    private byte value;

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

    /*

     */
    public byte getValue(){
        return value;
    }

    public byte setValue(byte newValue){return value;}
}
