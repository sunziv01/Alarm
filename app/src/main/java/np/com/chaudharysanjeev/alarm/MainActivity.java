package np.com.chaudharysanjeev.alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    /*private Object AlarmManager;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.etTime);
        btn=findViewById(R.id.btnButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartAlarm();
            }
        });
    }

    public void StartAlarm(){
        String v = et.getText().toString();
        Integer i = Integer.parseInt(v);

        Intent intent = new Intent(this,MyBroadCastReceiver.class);
        PendingIntent pIntent = PendingIntent.getBroadcast(this.getApplicationContext(),2345,intent,0);

       /* AlarmManager am = (AlarmManager).getSystemServices(ALARM_SERVICE);
        am.set(AlarmManager.RTC_WAKEUP,system.currentTimeMillis()+(i*100),pIntent);*/

        Toast.makeText(this, "Alarm Set in "+i+ " seconds", Toast.LENGTH_LONG).show();
    }

}