package com.example.blackplayermetajv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.google.android.material.chip.Chip;
import com.example.blackplayermetajv.NotificationListener;


import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.media.session.*;
import android.util.Log;

import java.util.List;

import java.util.Iterator;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaSessionManager mngr = (MediaSessionManager) this.getSystemService(Context.MEDIA_SESSION_SERVICE);
        List<MediaController> mm_list = GetMediaSessions(mngr);
        String str_list = Mc_to_Str(mm_list);
        Spinner speeen = findViewById(R.id.mediasessionlist);
        ArrayAdapter<Chip> inputlist = ArrayAdapter.createFromResource();
        speeen.setOnItemSelectedListener();


        Log.i("", str_list);
    }
    public String Mc_to_Str(List<MediaController> mm_list) {
        StringBuilder new_str = new StringBuilder();
        for (MediaController i : mm_list)
        {

            new_str.append(i.getPackageName() + "\n");


        }
        return new_str.toString();
    }
    public List<MediaController> GetMediaSessions(MediaSessionManager mngr)
    {
        return mngr.getActiveSessions(new ComponentName(this, NotificationListener.class));
    }
}