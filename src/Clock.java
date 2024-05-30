public class Clock {

    private int hours = 6;

    private int minutes;



    public Clock(){
        int variable = 0;
        //int variable = 1; - compilation error
        int minutes = 9;
        System.out.println(this.minutes);
        System.out.println(minutes);
    }

   public Clock(int h, int m){
       hours = h;
       minutes = m;


   }

    void setTime(int h, int m ) {
        if (h > 23) {
            hours = 23;
        } else {
            hours = h;
        }
        if (m > 59) {
            minutes = 59;
        } else {
            minutes = m;
        }



    }

    String getTime() {
        return hours + ":" + minutes  ;
    }

    void increaseMinutes(){
        minutes++;
        if(minutes == 60){
            minutes =0;
            hours++;
        }



    }


}

