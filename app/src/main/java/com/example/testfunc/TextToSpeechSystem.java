package com.example.testfunc;

import android.speech.tts.TextToSpeech;
import android.widget.Toast;
import android.speech.tts.TextToSpeech.OnInitListener;
import org.w3c.dom.Text;
import com.example.testfunc.TTsActivity;
import java.util.Locale;

public class TextToSpeechSystem  {
    TextToSpeech ttspeech;

    public void play(alarmclock clk){
        String note=clk.get_notes();
        ttspeech.speak(note,TextToSpeech.QUEUE_FLUSH,null);
    }
    public void get_tts(TextToSpeech tes){
        ttspeech=tes;
    }
    public  void main(){
    }


}
