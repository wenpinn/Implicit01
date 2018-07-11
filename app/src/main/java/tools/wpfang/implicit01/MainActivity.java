package tools.wpfang.implicit01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doWebPage(View view) {
        Intent it=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(it);
    }

    public void doCall(View view) {
        Intent it=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:0921094036"));
        startActivity(it);
    }

    public void doMap(View view) {
        Intent it=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:23.6978,120.9605"));
        startActivity(it);
    }
}
