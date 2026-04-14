class A{
  public static void main(String[] args) {
      System.out.println("in A");
  }
  
}
class B extends A{
  public B(){
    System.out.println("in B");
  }
}

public class thissuper{
  public static void main(String[] args) {
    B obj = new B();
  }
}