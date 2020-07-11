//Package name, указанный на этапе "Configure Your Project"
package com.example.startapp001;

//импорт как-то связан с AppCompatActivity и Bundle etc
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

//наследуем класс MainActivity от класса AppCompatActivity
public class MainActivity extends AppCompatActivity {

    //"увязываем" друг с другом Activity и Layuot, при помощи метода onCreate, переопределяя (@Override) последний
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //вызов метода родительского класса, выполняющий необходимые процедуры, что бы это ни значило
        super.onCreate(savedInstanceState);
        //устанавливаем содержимое Activity из layout-файла, указывая в качестве аргумента константу, которая является ID файла, генерируется автоматически, имя которой совпадает с именем файла ресурса без расширения
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
