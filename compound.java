class compound{//class name
    public  double calc(int i,int t,int r,int n){//to declare function
        
        return (i*((1+((r/100)/n))^(n*t)));//return function
    }
}
class Aaa{
    public static void main(String[] args) {//mondatory statement
        compound mycompound=new compound();//new class
        double result=mycompound.calc(500000,18,3,12);//to call object
        System.out.println("result:"+ result);//out put statement
    }
}


    

