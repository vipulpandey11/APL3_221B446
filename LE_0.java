public class JUET {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setname("John"); 
    System.out.println(myObj.getname());
    myObj.setAge(20); 
    System.out.println(myObj.getAge());
  }
}
class Person{
    int age;
    String name;
    public void setAge(int x){
        this.age = x;
    }
    public int getAge(){
        return age;
    }
    
    public void setname(String x){
        this.name = x;
    }
    public String getname(){
        return name;
    }
}