package sg.edu.rp.c346.senderapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 15031660 on 14/8/2017.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Toast my_toast = Toast.makeText(context, "Received in MyBroadcastReceiver" , Toast.LENGTH_LONG);
        my_toast.show();

    }
}
