package np.com.chaudharysanjeev.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/*import android.media.MediaPlayer;*/
import android.os.Vibrator;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver {
    /*MediaPlayer mp;*/
    Vibrator vb;
    @Override
    public void onReceive(Context context, Intent intent) {
        /*mp = new MediaPlayer(context,R.raw.alarm);*/
        vb = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        Toast.makeText(context, "Alarm Ringing", Toast.LENGTH_LONG).show();
        /*try{
            Thread.Sleep(10000);
        }
        catch(Exception e)
        {

        }*/
        /*mp.Stop();*/
    }
}
