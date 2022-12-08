//A.mukesh 192011505L
import java.util.Scanner;
public class Reverse{
public static void main(String args[])
{
String str;
char ch;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
str=sc.nextLine();
System.out.println("Revers of string " +str+ " is: ");
for(int j=str.length();j>0;--j)
{
System.out.println(str.charAt(j-1));
}
}
}