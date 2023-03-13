package phone;

public class Phone {
    public void call(){
        System.out.println("Calling..");
    }
    public void sms(){
        System.out.println("Sending sms..");
    }
}

interface Camera{
    public  abstract void click();
    public abstract void record();
} 

interface MusicPlayer{
    public abstract void play();
    public abstract void stop();
}
