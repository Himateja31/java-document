import java.util.*;
 interface Playable{
    void Play();
}
class Volleyball implements Playable{
      public void Play(){
        System.out.println("playing vollyball");

    }
}
class Football implements Playable{
    public void Play(){
        System.out.println("football");
    }
}
class Basketball implements Playable {

    public void Play() {
        System.out.println("playing basketball");
    }
}
class SportsGame {
    public static void main(String[] tej){
        Playable Volly= new Volleyball();
        Playable foot= new Football();
        Playable base= new Basketball();
        Volly.Play();
        foot.Play();
        base.Play();
    }
}

