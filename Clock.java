package com.netcracker.homeworks.project3;

/*------P9.2 Implement a class Clock whose getHours and getMinutes methods return the current
        time at your location. (Call java.time.LocalTime.now().toString() and extract the time
        from that string.) Also provide a getTime method that returns a string with the hours
        and minutes by calling the getHours and getMinutes methods. Provide a subclass World-
        Clock whose constructor accepts a time offset. For example, if you live in California,
        a new WorldClock(3) should show the time in New York, three time zones ahead.
        Which methods did you override? (You should not override getTime.)-------------*/

/*------P9.3 Add an alarm feature to the Clock class of Exercise •• P9.2. When setAlarm(hours,
        minutes) is called, the clock stores the alarm. When you call getTime, and the alarm
        time has been reached or exceeded, return the time followed by the string "Alarm" (or,
        if you prefer, the string "\u23F0") and clear the alarm. What do you need to do to
        make the setAlarm method work for WorldClock objects?-----------*/



public class Clock {
    private String hours;
    private String minutes;
    private int alarmHours;
    private int alarmMinutes;

    public Clock() {
    }

    public String getHours(){
       hours = java.time.LocalTime.now().toString().substring(0,2);
       return hours;
   }

   public String getMinutes(){
       minutes = java.time.LocalTime.now().toString().substring(3,5);
       return minutes;
   }

   public String getTime(){
       return getHours() + ":" + getMinutes();
   }

   public void setAlarm(int hour, int minutes){
        alarmHours = hour;
        alarmMinutes = minutes;
   }

   public String getAlarm(){
        if(Integer.parseInt(hours) >= alarmHours){
            if(Integer.parseInt(minutes) >= alarmMinutes){
                alarmHours = 0;
                alarmMinutes = 0;
                return getTime() + " Alarm!!!";
            }
        } return getTime();
   }
}

