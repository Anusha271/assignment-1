public Partcipant(int id,string name,string skill){
this.id=id;
this.name=name;
this.skill=skill;
@Override
public string toString(){
return "participant[+"id+","+name+","+skill+"]";
}
public int hashcode(){
return id;
}
public boolean equals(object obj){
return this.hashcode()==obj.hashcode();
}
}
