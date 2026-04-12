class Human{
  private int age;
  private String name="Navin";

  //constructor
  public Human(){
    System.out.println("in constructor");
  }

  //getter
  public int getage(){
    return age;
  }
  public String getName(){
    return name;
  }
  //setter
  public void setage(int age){
    this.age = age;
  }
  public void setName(String name){
    this.name=name;
  }
  
}
public class Enc {
  public static void main(String[] args) {
    Human obj = new Human();
    obj.setage(10);
    obj.setName("Raj");
    System.out.println(obj.getage()+obj.getName());
  }
}
