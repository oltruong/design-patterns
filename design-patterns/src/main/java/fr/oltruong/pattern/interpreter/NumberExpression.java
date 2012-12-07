package fr.oltruong.pattern.interpreter;

/**
 * @author oltruong
 */
public class NumberExpression
    extends AbstractExpression
{

    @Override
    public int interpret( Context context )
    {
        return Integer.parseInt( context.getElement() );
    }

}
