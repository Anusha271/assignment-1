import java.util.*;
import java.io.*;
class Ch_file
{
 public static void main(String args[])throws IOException
{
     int n1=1,nw=0;           
     char ch;
     Scanner sc=new Scanner(System.in);
     System.out.println("\nEnter File name: ");
     String st=sc.nextLine();
     FileInputStream f=new FileInputStream(st);
     int n=f.available();
     for(int i=0;i<n;i++)
{
     ch=(char)f.read();
     if(ch=='\n')
     nl++;
     else if(ch==' ')
     nw++;
}
System.out.println("\nNumber of lines : "+nl);
System.out.println("\nNumber of words : "+(nl+nw));
System.out.println("\nNumber of characters : "+n);
}
}
