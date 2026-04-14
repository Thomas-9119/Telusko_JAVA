class car{
  public void drive(){

  }
  public void playMusic(){
    System.out.println("play music");
  }
}

class wagonR extends car{
  public void drive(){
    System.out.println("driving");
  }
}
public class abstractk {
  public static void main(String[] args) {
    car obj = new car();
    obj.drive();
    obj.playMusic();
  }
}
