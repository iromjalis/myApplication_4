package fi.irinaromjalis.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String EXTRA_MESSAGEAGE = "com.example.myfirstapp.MESSAGE3";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, NewActivity.class);

        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editTextAge = (EditText) findViewById(R.id.editTextAge);

        String message = editText.getText().toString();
        String messageAge = editTextAge.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGEAGE, messageAge);
        startActivity(intent);
    }
}