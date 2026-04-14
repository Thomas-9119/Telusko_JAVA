class Calc{
  public int add(int n1,int n2){
    return n1+n2;
  }
  public int sub(int n1,int n2){
    return n1-n2;
  }
}
public class inherit {
  public static void main(String[] args) {
    Calc obj = new Calc();
    int r1 = obj.add(5,6);
    int r2 = obj.sub(9,7);
    System.out.println(r1);
    System.out.println(r2);

  }
}
