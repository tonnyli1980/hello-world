import java.io.*;


public class SimpleDotComGame
{
    public static void main(String[] args) 
    {
        int numofGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum,randomNum+1,randomNum+2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive)
        {
            String userGuess = helper.getUserInput("guess a number: ");
            String result = theDotCom.checkYourself(userGuess);
            numofGuess++;
            if(result.equals("kill")) {
               isAlive = false;
               System.out.println("You took " + numofGuess + "guesses");
            }
        }
    }
}


class SimpleDotComTestDrive 
{
    public static void main(String[] args) 
    {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "5";
        String result = dot.checkYourself(userGuess);
/*
        String testResult = "failed";   //set default result
        if (reult.equals("hit"))
        {
            testResult = "passed";
        }

        System.out.println(testResult);
        */
    }
}

class SimpleDotCom
{
    int[] locationCells;
    int numOfHits = 0;

    //public void SimpleDotCom(){};
 

    public void setLocationCells(int[] locs)
    {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess)
    {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";     //default result

        for (int cell : locationCells)
        {
            if (guess == cell)
            {
                result = "hit";
                numOfHits++;
                break;
            }//end if
        }//end for
        if (numOfHits == locationCells.length)
        {
            result = "kill";
        }//end if
        System.out.println(result);
        return result;
    }//end method
}

class GameHelper
{
    public String getUserInput(String prompt)
    {
        String inputLine = null;
        System.out.print(prompt +" ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));   //Read input from user screen
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
