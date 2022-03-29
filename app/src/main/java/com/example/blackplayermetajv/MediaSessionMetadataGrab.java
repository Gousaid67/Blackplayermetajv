package com.example.blackplayermetajv;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.example.blackplayermetajv.NotificationListener;

public class MediaSessionMetadataGrab extends Service {
    public MediaSessionMetadataGrab() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}