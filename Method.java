class Computer{
  public void playMusic()
  {
    System.out.println("Music Playing");
  }

  public String getMePen(int cost){
    return "Pen";
  }
}

public class Method {
  public static void main(String[] args) {
    Computer obj = new Computer();
    obj.playMusic();
    int cost=10;
    String str = obj.getMePen(cost);
    System.out.println(str);

  }
}
