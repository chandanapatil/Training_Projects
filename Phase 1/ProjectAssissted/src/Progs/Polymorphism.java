package Progs;
class AdditionEx{
    void sum() {
   	 System.out.println("no arg");
    }
    void sum(int a,int b)
    {
   	 System.out.println("2 args in it "+(a+b));
    }
    void sum(double a,double b) {
   	 System.out.println("2 args of float it "+(a+b));
    }
}


public class Polymorphism {
	public static void main(String[] args) {
	   	 AdditionEx ex=new AdditionEx();
	   	 ex.sum(10.0, 20.0);
	}

}
