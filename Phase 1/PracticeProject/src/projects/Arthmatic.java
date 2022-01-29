package projects;

import java.util.Scanner;
public class Arthmatic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("eneter the two numbers");
	int Fnum=sc.nextInt();
	int Snum= sc.nextInt();
	System.out.println("Enter the operator ");
	char op=sc.next().charAt(0);
	double Ans=0;
	switch(op){
	case '+': Ans=Fnum+Snum;
	break;
	case '-':Ans=Fnum-Snum;
	break;
	case '*': Ans=Fnum*Snum;
	break;
	case '/':Ans=Fnum/Snum;
	break;
	}
	System.out.println("the answer is " +Ans);
	}

}
