package pl.zabrze.zs10.powtorka3p_piatek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2023_styczen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2023_styczen);
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Posprzatac");
        todoList.add("Zakupy");
        todoList.add("Kino");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,todoList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}