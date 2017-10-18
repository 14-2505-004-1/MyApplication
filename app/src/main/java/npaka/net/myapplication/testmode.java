package npaka.net.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class testmode extends AppCompatActivity {

    int qCounter = 3;
    int count = 0;
    int sum = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testmode);


        Intent intent = getIntent();
        int  intid = intent.getIntExtra("NUMBER",0);

        TextView countlabel = (TextView)findViewById(R.id.number);
        count = intid + 1;
        countlabel.setText(String.valueOf(count));
    }

    public void onrNextButtonTapped(View view){
        if(count >= sum){
            Intent intent = new Intent(this, result.class);
            intent.putExtra("NUMBER",count);
            startActivity(intent);
        }else {
            Intent intent = new Intent(this, testmode.class);
            intent.putExtra("NUMBER",count);
            startActivity(intent);
        }

    }

    public void onresultButtonTapped(View view){
        Intent intent = new Intent(this, result.class);
        startActivity(intent);
    }
}
