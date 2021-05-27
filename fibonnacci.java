import java.util.*;
import java.util.Scanner;
class fibonnacci{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers");
		int n=sc.nextInt();
		int a1=0,a2=1;
		for(int i=1;i<n;i++){
		int a3=a1+a2;
		System.out.printf(a3+"\t");
		a1=a2;
		a2=a3;
		}
		
        System.out.println();
    }
    }
