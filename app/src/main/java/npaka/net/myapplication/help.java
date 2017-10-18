package npaka.net.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }
    public void onHelpUseButtonTapped(View view) {
        Intent intent = new Intent(this,help_use.class);
        startActivity(intent);
    }
    public void onHelpKanpoButtonTapped(View view) {
        Intent intent = new Intent(this, help_kanpo.class);
        startActivity(intent);
    }
    public void onHelpZetsuButtonTapped(View view) {
        Intent intent = new Intent(this, help_zetsu.class);
        startActivity(intent);
    }
    public void onMainButtonTapped(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
