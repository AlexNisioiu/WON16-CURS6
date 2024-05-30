
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        String param = "test";
        String s = new String(param);
        String s2 = new String("alt test");

        Clock c = new Clock();
        c.setTime(15,25, 15);
        Clock c2 = new Clock();

        Clock customClook = new Clock(3,15 , 50);


        System.out.println(c.getTime());
        customClook.increaseMinutes();
        System.out.println(customClook.getTime());
    }

}