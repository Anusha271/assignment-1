
import java.util.*;
import java.io.*;
class ReadFile
{
  public static void main(String args[])throws IOException
 {
     int a=1;
     char ch;
     Scanner sc=new Scanner(System.in);
     System.out.print("\nEnter File name: ");
     String st=sc.next();
     FileInputStream f=new FileInputStream(st);
     System.out.println("\nContents of the file are");
     int n=f.available();
     System.out.print(a+": ");
     for(int i=0;i<n;i++)
{
     ch=(char)f.read();
     System.out.print(ch);
     if(ch=='\n')
{
     System.out.print(++a+": ");
  }
   }
}
