package cd.brel.malunguzantotob.projet_ig;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        //setTitle("My Profile");
        ActionBar Abar = getSupportActionBar();
        Abar.setTitle("My Profile");
    }
}
