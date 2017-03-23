package br.grupointegrado.jucemard.todoproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> todo = new ArrayList<>();
        todo.add("Treinar CS para o Campeonato");
        todo.add("Teste do Bruno");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lvToDo = (ListView) findViewById(R.id.lvTodo);

        ArrayAdapter<String> aaLvToDo = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, todo);

        lvToDo.setAdapter(aaLvToDo);

    }

    public void gotoAddToDo(View v) {

//        Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show();

        startActivity(new Intent(this, RegisterToDoActivity.class));

    }

}
