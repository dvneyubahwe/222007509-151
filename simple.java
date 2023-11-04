class SimpleInterest//class name
{
    public double Calculate(double principal, double rate, double time)//to declare function
    {
        return principal*rate*time;//return function
    }
}
class Objects {//public class
    public static void main (String [] args){
 SimpleInterest mySI = new SimpleInterest();//new class
 double result = mySI.Calculate(100000,0.05 ,5);//to call object
 System.out.println(" Result: " + result);//output
    }
}

