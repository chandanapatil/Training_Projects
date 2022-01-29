package Progs;
class Outer {

    void outerMethod()
    {

        System.out.println("inside outerMethod");

        class Inner {

            void innerMethod()
            {

                System.out.println("inside innerMethod");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}

public class Innercls {
	
		 
	    public static void main(String[] args)
	    {
	        Outer x = new Outer();
	        x.outerMethod();
	    }
	}

