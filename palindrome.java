import java.io.*;
import java.util.*;
public class palindrome
{
public static voiod main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();
int flag=0;
char[] ch=str.tocharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]!=ch[ch.length-1-i])
{
flag=1;
break;
}
}
if(flag==0)
System.out.println("given string is palindrome");
else
System.out.println("given string is not palindrome");
}
}
