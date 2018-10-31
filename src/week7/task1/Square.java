package week7.task1;

public class Square extends Expression {
    Expression expression ;
    public  Square (Expression expression){
        this.expression=expression;
    }

    @Override
    public String toString() {
        return "Tuanmatseo";
    }

    @Override
    public int evaluate() {
        return (expression.evaluate()*expression.evaluate());
    }
}
