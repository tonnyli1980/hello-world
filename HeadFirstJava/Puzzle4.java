public class  Puzzle4
{
    public static void main(String[] args) 
    {
        Puzzle4b [] obs = new Puzzle4b[6]; //blank1
        int y = 1;
        int x = 0;
        int result = 0;

        while (x < 6) {
            obs[x] = new Puzzle4b();
            obs[x].ivar = y; //blank3
            y = y *10;
            x = x + 1; //blank4
        }

        x = 6;
        while (x >0) {
            x = x - 1; //blank5
            result = result + obs[x].doStuff(x);                  //blank6
        }
        System.out.println("result" + result);
    }
}

class Puzzle4b  {
    int ivar;
    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar * factor;
        } else {
            return ivar * (5 - factor);
        }
    }
}
