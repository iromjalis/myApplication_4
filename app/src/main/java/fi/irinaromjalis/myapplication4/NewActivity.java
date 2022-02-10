package fi.irinaromjalis.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        Intent intent1 = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String messageAge = intent1.getStringExtra(MainActivity.EXTRA_MESSAGEAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText("Welcome " + message + ", \n you are " + messageAge + " year(s) old.");

    }
}