package com.ipc.wg.ipcserver.server;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;

/**
 * Created by lypeer on 2016/7/16.
 */
public class MessengerService extends Service {

    private static final int SAY_HOLLE = 0;

    static class ServiceHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SAY_HOLLE:
                    Log.e(getClass().getSimpleName() , "HELLO !");
                    break;
                default:
                    super.handleMessage(msg);
                    break;
            }
        }
    }

    final Messenger mMessenger = new Messenger(new ServiceHandler());

    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("binding");
        return mMessenger.getBinder();
    }
}
