package Arithmetic;
import java.lang.Number;
public class Arithmetic<T extends Number> {

    private T num1;

    private T num2;

    public Arithmetic() {

    }

    public Arithmetic(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add(){
        return (num1.doubleValue() + num2.doubleValue());
    }

    public Number add(Number n1,Number n2){
        return (n1.doubleValue() + n2.doubleValue());
    }


    public Number subtract(){
        return (num1.doubleValue() - num2.doubleValue());
    }

    public Number subtract(Number n1,Number n2){
        return (n1.doubleValue() - n2.doubleValue());
    }

    public Number multiply(){
        return (num1.doubleValue() * num2.doubleValue());
    }

    public Number multiply(Number n1,Number n2){
        return (n1.doubleValue() * n2.doubleValue());
    }

    public Number divide(){
        return (num1.doubleValue() / num2.doubleValue());
    }

    public Number divide(Number n1,Number n2){
        return (n1.doubleValue() / n2.doubleValue());
    }

    public Number getMin(){
        if(num1.doubleValue() > num2.doubleValue()){
            return num2;
        }
        return num1;
    }

    public Number getMax(){
        if(num1.doubleValue() > num2.doubleValue()){
            return num1;
        }
        return num2;
    }

    public Number getMin(Number n1,Number n2){
        if(n1.doubleValue() > n2.doubleValue()){
            return n2;
        }
        return n1;
    }

    public Number getMax(Number n1,Number n2){
        if(n1.doubleValue() > n2.doubleValue()){
            return n1;
        }
        return n2;
    }



}
