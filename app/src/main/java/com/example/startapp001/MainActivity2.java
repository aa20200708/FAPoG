package com.example.startapp001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent gmail = new Intent(Intent.ACTION_VIEW);
                gmail.setClassName("com.google.android.gm","com.google.android.gm.ComposeActivityGmail");
                gmail.putExtra(Intent.EXTRA_EMAIL, new String[] { "santa_claus@gmail.com", "freeit.andr0id@gmail.com", "aa20200708@gmail.com" });
                gmail.putExtra(Intent.EXTRA_SUBJECT, "Android task1");
                gmail.putExtra(Intent.EXTRA_TEXT, "Дорогой Дедушка Мороз, я в курсе, что тебя не существует. Все, чего я хочу, прошу у мамы. И посредники нам ни к чему");
                startActivity(gmail);
                System.exit(0);
            }
        });
    }
}
