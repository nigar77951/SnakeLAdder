public class SnakeLadder {
    public final static int IS_LADDER=1;
    public static final int IS_SNAKE=2;
    public static void main(String[] args) {
        int strtpos=0;
        int curpos=0;
		int c=0;

        while(curpos!=100) {

            int dicenum = (int) ((Math.floor(Math.random() * 10 % 6)) + 1);
            System.out.println("Current face of die is : " + dicenum);

            int play = (int) (Math.floor(Math.random() * 10) % 3);
            System.out.println("option : " +play);
            switch(play) {
                case IS_LADDER:
                    curpos += dicenum;
					c++;
                    break;
                case IS_SNAKE:
                    curpos -= dicenum;
                    c++;
					break;
                default:
                    curpos = curpos;
                    c++;
					break;
            }
            System.out.println("new position = "+curpos);
        }
        System.out.println("reached winning position :" +curpos);
		System.out.println("count = "+c);
    }

}

