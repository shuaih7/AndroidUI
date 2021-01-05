import java.util.*;


public class javaio{
    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("what is your name?\n");
	String name =in.nextLine();
	System.out.print("How old are you?\n");
	int age=in.nextInt();
	System.out.print("Hello,"+name+".Next year,you'll be "+(age+1)+".");
	}
}