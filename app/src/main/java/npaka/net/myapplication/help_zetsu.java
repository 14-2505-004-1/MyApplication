package npaka.net.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class help_zetsu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_zetsu);
    }
    public void onHelpButtonTapped(View view) {
        Intent intent = new Intent(this, help.class);
        startActivity(intent);
    }
}
