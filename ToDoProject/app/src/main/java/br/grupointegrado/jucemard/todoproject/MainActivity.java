package br.grupointegrado.jucemard.todoproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = (ListView) findViewById(R.id.lvTodo);

        List<String> toDos = Arrays.asList( "Todo...01",
                                            "Todo...02",
                                            "Todo...03",
                                            "Todo...04",
                                            "Todo...05",
                                            "Todo...06",
                                            "Todo...02",
                                            "Todo...03",
                                            "Todo...04",
                                            "Todo...05",
                                            "Todo...06",
                                            "Todo...02",
                                            "Todo...03",
                                            "Todo...04",
                                            "Todo...05",
                                            "Todo...06",
                                            "Todo...02",
                                            "Todo...03",
                                            "Todo...04",
                                            "Todo...05",
                                            "Todo...06",
                                            "Todo...07");

        ArrayAdapter<String> la =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, toDos);

        lvToDo.setAdapter(la);
    }

    public void gotoAddToDo(View v) {

//        Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show();

        startActivity(new Intent(this, RegisterToDoActivity.class));

    }

}
