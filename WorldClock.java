package com.netcracker.homeworks.project3;

/*------P9.2 Implement a class Clock whose getHours and getMinutes methods return the current
        time at your location. (Call java.time.LocalTime.now().toString() and extract the time
        from that string.) Also provide a getTime method that returns a string with the hours
        and minutes by calling the getHours and getMinutes methods. Provide a subclass World-
        Clock whose constructor accepts a time offset. For example, if you live in California,
        a new WorldClock(3) should show the time in New York, three time zones ahead.
        Which methods did you override? (You should not override getTime.)-------------*/


public class WorldClock extends Clock{
    private String worldHours;
    private String worldMinutes;
    private int worldAlarmHour;
    private int worldAlarmMinutes;
    int timeZone = 0;


    public WorldClock(int timeZone) {
        super();
        this.timeZone = timeZone;
    }

    public String getHours(){
        worldHours = String.valueOf(Integer.parseInt(super.getHours()) + timeZone);
        return worldHours;
    }

    public String getMinutes(){
        worldMinutes = super.getMinutes();
        return worldMinutes;
    }

    public String getTime(){
        return getHours() + ":" + getMinutes();
    }

    @Override
    public void setAlarm(int hour, int minutes) {
        worldAlarmHour = hour + timeZone;
        worldAlarmMinutes = minutes;
    }

    public String getWorldAlarm() {
        if (Integer.parseInt(worldHours) >= worldAlarmHour) {
            if (Integer.parseInt(worldMinutes) >= worldAlarmMinutes) {
                worldAlarmMinutes = 0;
                worldAlarmMinutes = 0;
                return getTime() + " Alarm!!!";
            }
        }
        return getTime();
    }
}
