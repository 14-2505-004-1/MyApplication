package npaka.net.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class testmode extends AppCompatActivity {

    int qCounter = 3;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testmode);

       /* TextView countlabel = (TextView)findViewById(R.id.number);
        count++;
        countlabel.setText(String.valueOf(count));*/
    }

    public void onrNextButtonTapped(View view){
        if(count > 2){
            Intent intent = new Intent(this, result.class);
            startActivity(intent);
        }else {
            Intent intent = new Intent(this, testmode.class);
            startActivity(intent);
        }

    }

    public void onresultButtonTapped(View view){
        Intent intent = new Intent(this, result.class);
        startActivity(intent);
    }

}
