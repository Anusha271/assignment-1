import java.util.Scanner; 
class  Reverse 
{ 
public static void main(String[] args)  
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("enter the string"); 
String str=sc.nextLine(); 
char ch[]=str.toCharArray(); 
for (int i=0 ;i<ch.length/2;i++ ) 
{ 
char t=ch[i]; 
ch[i]=ch[ch.length-1-i]; 
ch[ch.length-1-i]=t; 
} 
str=new String (ch); 
System.out.println("Reserved string is :"+str);  
} 
}
