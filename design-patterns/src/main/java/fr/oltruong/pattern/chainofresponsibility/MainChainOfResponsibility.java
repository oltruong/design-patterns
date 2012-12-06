package fr.oltruong.pattern.chainofresponsibility;

/**
 * Chain of responsibility pattern enables to have several objects handle a request
 * 
 * @author oltruong
 */
public class MainChainOfResponsibility
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        HelpDesk helpDesk2 = new Level2HelpDesk( 2 );
        HelpDesk helpDesk1 = new Level1HelpDesk( 1 );

        helpDesk1.setSuccessor( helpDesk2 );

        System.out.println( "Sending complaint level 0..." );
        helpDesk1.handleComplaint( 0 );
        System.out.println( "----" );

        System.out.println( "Sending complaint level 1..." );
        helpDesk1.handleComplaint( 1 );
        System.out.println( "----" );

        System.out.println( "Sending complaint level 2..." );
        helpDesk1.handleComplaint( 2 );
        System.out.println( "----" );

    }

}
