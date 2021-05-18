abstract class Item{
  int getters();
  int setters();
  int checkin();
  int checkot();
  int additem();
  int print();
  private int identifiction_no=1234;
  private char tittle="abcd";
  private int noofcopies=5;
}
abstract class   Writtenitem extends Item{
  int getters();
  int setters();
  int checkin();
  int checkot();
  int additem();
  int print();
  private char author;
}
public class Book extends Writtenitem{


  }
  public class Journalpaper extends Writtenitem{
  private int year_ofpublished();
  }
  abstract class Mediaitem extends Item{
  int getters();
  int setters();
  int checkin();
  int checkot();
  int additem();
  int print();
  private int runtime;
  }
  class vedio extends Mediaitem{
  private char director;
  private int publishedyear;
  private char genre;
  }
  class Cd extends Mediaitem{
  private char artist;
  private char genre;
  }
  class Clientprogram{
  public static void main(String[] args){
  Item t1;
  t1=new
  Workitem t2;
  Mediaitem t3;
  }
  }
