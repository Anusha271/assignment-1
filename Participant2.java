public class Main{
public static void main(String[] args){
Participant p1= new Participant(11,Rohit,java);
Participant p2= new Participant(12,Revanth,Html);
Participant p3= new Participant(13,Reshma,sql);
Hashset.hs= new Hashset(13);
hs.add(p1);
hs.add(p2);
hs.add(p3);
System.out.println("size of participant:"+hs.size());
for(object pts:hs){
System.out.println(pts);
}
}
