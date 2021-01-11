public class SnakeLadder {
    public final static int IS_LADDER=1;
    public static final int IS_SNAKE=2;
    public static void main(String[] args) {
        int strtpos=0;
        int curpos=0;

        int dicenum = (int) ((Math.floor(Math.random() * 10 % 6)) + 1);
        System.out.println("Current face of die is : " + dicenum);

        int play = (int) (Math.floor(Math.random() * 10) % 3);
        System.out.println("option : " +play);
        switch(play) {
            case IS_LADDER:
                curpos += dicenum;
                break;
            case IS_SNAKE:
                curpos -= dicenum;
                break;
            default:
                curpos = curpos;
                break;
        }
        System.out.println("new position = "+curpos);
    }

}
