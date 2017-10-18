package npaka.net.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        int  intid = intent.getIntExtra("NUMBER",99);

        TextView countlabel = (TextView)findViewById(R.id.result_number);
        countlabel.setText(String.valueOf(intid));
    }
}
