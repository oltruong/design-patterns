package fr.oltruong.pattern.chainofresponsibility;

/**
 * @author oltruong
 */
public abstract class HelpDesk
{

    protected HelpDesk successor;

    protected int definedSeverity;

    public HelpDesk( int severity )
    {
        this.definedSeverity = severity;
    }

    public void handleComplaint( int severity )
    {

        if ( severity >= definedSeverity )
        {
            doTheJob();
        }
        if ( successor != null )
        {
            successor.handleComplaint( severity );
        }

    }

    abstract void doTheJob();

    public void setSuccessor( HelpDesk successor )
    {
        this.successor = successor;
    }

}
