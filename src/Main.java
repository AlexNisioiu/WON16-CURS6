
 public class Main{

    public static void main(String[] args){
            System.out.println("Hello world! ");
            String param = "test";
            String s = new String(param);
            String s2 = new String("alt test");

        Clock c  = new Clock();
        c.setTime(99999, 99999);
        Clock c2 = new Clock();

        Clock customClock = new Clock(3 , 15);


        System.out.println(c.getTime());
    }

}