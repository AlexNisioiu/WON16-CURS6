public class Clock {

    private int hours = 6;

    private int minutes;

    private int seconds;

    public Clock(){

    }

   public Clock(int h, int m ,int s){
       hours = h;
       minutes = m;
       seconds = s;

   }

    void setTime(int h, int m, int s) {
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
        if (s > 60) {
            seconds = 0;
        } else {
            seconds = s;
        }

    }

    String getTime() {
        return hours + ":" + minutes + ":" + seconds;
    }

    void increaseMinutes(){
        minutes++;
        if(minutes == 60){
            minutes =0;
            hours++;
        }
    }




}

