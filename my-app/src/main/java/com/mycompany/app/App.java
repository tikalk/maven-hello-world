package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length == 1) 
        {
            try 
            {
                int starWarsSequence = Integer.parseInt(args[0]);
                String MovieName = "";
                switch (starWarsSequence) 
                {
                     case 1:
                        MovieName = "1";
                        break;
                     case 2:
                        MovieName = "2";
                        break;
                     case 3:
                        MovieName = "3";
                        break;
                     case 4:
                        MovieName = "4";
                        break;
                     case 5:
                        MovieName = "5";
                        break;
                     case 6:
                        MovieName = "6";
                        break;
                     case 7:
                        MovieName = "7";
                        break;
                }
                if( MovieName == "" )
                {
                    System.err.println("There is still no Star Wars movie with sequence #" + starWarsSequence);
                    System.exit(3);
                }
                else
                {
                    System.out.println("Star Wars movie #" + starWarsSequence + name is: "+ MovieName);
                }
            }
            catch (NumberFormatException e) 
            {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(2);
            }
        }
        else
        {
            System.err.println("There must be exactly 1 argument.");
            System.exit(1);
        }
    }
}
