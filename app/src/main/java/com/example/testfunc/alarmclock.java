package com.example.testfunc;
import java.io.Serializable;
import java.lang.String;
public class alarmclock implements Serializable {
    public int alarmclk_num;
    private double alarmtime;
    private String notes;
    private boolean tts_state;

    public void set_on(){
        tts_state=true;
    }
    public void set_off(){
        tts_state=false;
    }
    public String get_notes(){
        return notes;
    }
    public void set_notes(String a){
        notes=a;
    }


}
