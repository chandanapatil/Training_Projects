package Progs;

public class Diffmeth {
	public int CompareNum()   
    {   
        int x = 3;  
        int y = 8;  
        System.out.println("x = " + x + "\ny = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  
    }  

    public static void main(String ar[])   
    {  
    	Diffmeth obj = new Diffmeth();  
        int result = obj.CompareNum();  
        System.out.println("The greater number among x and y is: " + result);  
    }  
} 


class SumReturn  
{  
    private int a;  
    public SumReturn(int i)  
    {  
        a = i;  
    }  

    public SumReturn addition()  
    {  
        SumReturn result = new SumReturn(a + 100);  
  
        return result;  
    }  
    public void display()  
    {  
        System.out.println("Additon result: " + a);  
    }  
}  
 class SampleReturn3  
{   
    public static void main(String[] args)  
    {  
        SumReturn obj1 = new SumReturn(50);  
        SumReturn obj2;    
        obj2 = obj1.addition();  
        obj2.display();  
    }  
} 


