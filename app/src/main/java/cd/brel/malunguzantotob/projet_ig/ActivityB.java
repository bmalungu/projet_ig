package cd.brel.malunguzantotob.projet_ig;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {
     WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        //setTitle("About ALC");
        ActionBar Abar = getSupportActionBar();
        Abar.setTitle("About ALC");

        wv=findViewById(R.id.wv);
        try {
            wv.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv.getSettings();
            webSettings.setDomStorageEnabled(true);
            webSettings.setJavaScriptEnabled(true);

            wv.loadUrl("https://www.facebook.com");
            //wv.loadUrl("https://andela.com/alc/");
        }catch(Exception e){ Toast.makeText(getApplicationContext(),"Error: "+e,Toast.LENGTH_LONG);}

    }
}
