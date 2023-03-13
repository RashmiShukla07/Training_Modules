package phone;

public class SmartPhone extends Phone implements Camera,MusicPlayer  {
    public void click(){
        System.out.println("Captures Image");
    }
    public  void record(){
        System.out.println("Captures Video");
    }
    public  void play(){
        System.out.println("Music Playing");
    }
    public  void stop(){
        System.out.println("Stops Playing Music");
    }

}