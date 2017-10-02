package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length != 1) 
        {
            try 
            {
                int starWarsSequence = Integer.parseInt(args[0]);
                System.out.println("Star Wars sequance: " + starWarsSequence.toString());
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
