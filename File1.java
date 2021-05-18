
import java.io.*;
import java.util.*;
class File1
{
public static void main(String args[])
{
File f=new File(args[0]);
System.out.println(f.is exists()?”file isexists”:” file is not exist”);
System.out.println(“Filename:”+f.getName());
System.out.println(“Filepath:”+f.getAbsolutePath());
System.out.println(f.isDirectory()?”is a directory”:”is a simple file”);
System.out.println(f.canRead()?”can be read”:”can not be read”);
System.out.println(f.canWrite()?”can be write”:”can not be write”);
System.out.println(“length of file in bytes:”+f.length());
}
}
