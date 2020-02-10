public class Calculator {

    private int num1;
    private int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int AddNumbers(){
            return this.num1 + this.num2;
    }
    public int SubtractNumbers(){
     return this.num1 - this.num2;
    }
    public int MultiplyNumbers(){
     return this.num1 * this.num2;
    }
    public int DivideNumbers(){
        return this.num1/this.num2;
    }
}
