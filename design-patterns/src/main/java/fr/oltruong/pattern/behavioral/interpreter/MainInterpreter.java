package fr.oltruong.pattern.behavioral.interpreter;

/**
 * Interpreter as its name suggests enables the builder of an interpreter for a language
 * 
 * @author oltruong
 */
public class MainInterpreter
{

    public static void main( String[] args )
    {
        AbstractExpression plusExpression = new PlusExpression( new NumberExpression(), new NumberExpression() );

        Context context = new Context( null );

        System.out.println( "30" );

        System.out.println( "15" );

        System.out.println( "+" );

        context.addSequence( "30" );
        context.addSequence( "15" );

        System.out.println( "=" );

        int result = plusExpression.interpret( context );
        System.out.println( result );
    }

}
