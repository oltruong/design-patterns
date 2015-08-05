package com.oltruong.pattern.behavioral.interpreter;

/**
 * @author oltruong
 */
public class PlusExpression
    extends AbstractExpression
{

    private AbstractExpression expression1;

    private AbstractExpression expression2;

    public PlusExpression( AbstractExpression expression1, AbstractExpression expression2 )
    {
        this.expression1 = expression1;
        this.expression2 = expression2;

    }

    @Override
    int interpret( Context context )
    {

        return expression1.interpret( context ) + expression2.interpret( context );
    }

}
