import phone.SmartPhone;

class PhoneTest {
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone();

        sp.call();
        sp.sms();
        sp.click();
        sp.record();
        sp.play();
        sp.stop();
    }
}
