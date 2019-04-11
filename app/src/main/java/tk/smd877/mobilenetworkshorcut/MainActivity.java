package tk.smd877.mobilenetworkshorcut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Intent i = new Intent();
            i.setClassName("com.android.phone", "com.android.phone.MobileNetworkSettings");
            startActivity(i);
        } catch (Exception e) {
            Toast.makeText(this, "Sorry!", Toast.LENGTH_SHORT).show();
        }
        finish();
    }
}
