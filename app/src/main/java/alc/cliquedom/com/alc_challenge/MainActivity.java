package alc.cliquedom.com.alc_challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent alcIntent = new Intent(MainActivity.this,AlcActivity.class);
        final Intent profileIntent = new Intent(MainActivity.this,ProfileActivity.class);

        Button buttonAlc = (Button) findViewById(R.id.button);
        buttonAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(alcIntent);
            }
        });

        Button buttonProfile = (Button) findViewById(R.id.button2);
        buttonProfile.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(profileIntent);
            }
        });
    }
}
