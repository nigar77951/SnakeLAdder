public class SnakeLadder {
    public final static int IS_LADDER=1;
    public static final int IS_SNAKE=2;
    public static void main(String[] args) {
        int strtpos=0;
        int curpos=0;
int prev=0;

        while(curpos!=100) {

            int dicenum = (int) ((Math.floor(Math.random() * 10 % 6)) + 1);
            System.out.println("Current face of die is : " + dicenum);

            int play = (int) (Math.floor(Math.random() * 10) % 3);
            System.out.println("option : " +play);
            switch(play) {
                case IS_LADDER:
					prev=curpos;
                    curpos += dicenum;
                    break;
                case IS_SNAKE:
					prev=curpos;
                    curpos -= dicenum;
					break;
                default:
					prev=curpos;
                    curpos = curpos;
					break;
            }
            System.out.println("new position = "+curpos);
			if(curpos>100) {
				curpos=prev;
				System.out.println("same old location "+curpos);
			}
			else if(curpos==100) {
				System.out.println("Current position is "+curpos);
			}
			else if(curpos<0) {
				curpos=strtpos;
				System.out.println("You are at start position again "+curpos);
			}
        }
        System.out.println("...Won---Game!...congratulations");
    }

}

