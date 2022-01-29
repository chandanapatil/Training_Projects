package Progs;

class Birds{
    void sleep() {
   	 System.out.println("Birds sleeps");
    }
}
class peacock extends Birds{
    void eat() {
   	 System.out.println("peacock do eat");
    }
}

public class Inheritance {
    public static void main(String[] args) {
    	peacock p=new peacock();
   	p.eat();
   	p.sleep();
   	 
   	 
    }
    }

