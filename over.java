//Method Overloading

class Calculatorr{
  public int add(int n1,int n2){
    int res = n1+n2;
    return res;
  }
  public int add(int n1,int n2,int n3){
    int res = n1+n2+n3;
    return res;
  }
}

public class over {
  public static void main(String[] args) {
    Calculatorr obj = new Calculatorr();
    int r1=obj.add(3,7);
    System.out.println(r1);
    int r2=obj.add(3,7,8);
    System.out.println(r2);
  }
}
