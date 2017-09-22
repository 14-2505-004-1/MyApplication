package npaka.net.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInfomationButtonTapped(View view){
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }
    public void onhelpButtonTapped(View view){
        Intent intent = new Intent(this, help.class);
        startActivity(intent);
    }
    public void onTestButtonTapped(View view){
        Intent intent = new Intent(this, testmode.class);
        startActivity(intent);
    }
}
