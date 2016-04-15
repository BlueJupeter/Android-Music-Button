package com.jupiter.blue.musicbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer hivesMP = MediaPlayer.create(this, R.raw.hate_to_say);

        Button playHate = (Button) this.findViewById(R.id.play_hate);

               playHate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hivesMP.isPlaying()) {
                   hivesMP.stop();
                    hivesMP.prepareAsync();
                } else {

                    hivesMP.start();
                }

            }});

    }
}
