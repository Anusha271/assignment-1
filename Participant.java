import java.util.Scanner;

class Participant {
  String name;
  String id;
   String skills;
  public Participant() {
    this(" ", " ", " ");
  }
  public Participant(String intName, String intId, String intskills) {
    name = intName;
    id = intId;
    skills= intskills;
  }
}

 class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input number of Participants:");
    int n = Integer.parseInt(in.nextLine().trim());
    System.out.println("Input Participant Name, ID, Skill:");
    Participant pts = new Participant();
    
    for (int i = 0; i < 5; i ++) {
      pts.name = in.next();
      pts.id = in.next();
      pts.skill = in.next();
      
    }
    System.out.println("name, id,skill:");
    in.close();
  }
}
