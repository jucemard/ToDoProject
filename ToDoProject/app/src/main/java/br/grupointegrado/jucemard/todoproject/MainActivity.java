package br.grupointegrado.jucemard.todoproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.grupointegrado.jucemard.todoproject.bd.DataBase;
import br.grupointegrado.jucemard.todoproject.model.ToDo;

public class MainActivity extends AppCompatActivity {
    private ListView lvToDo;
    private DataBase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = (ListView) findViewById(R.id.lvTodo);

        db = new DataBase(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_mainactivity, menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    protected void onResume() {
        super.onResume();

        List<ToDo> toDos = db.getTodos();

        ArrayAdapter<ToDo> la =
                new ArrayAdapter<ToDo>(this, android.R.layout.simple_list_item_1, toDos);

        lvToDo.setAdapter(la);
    }

    public void gotoAddToDo(View v) {

        Intent i = new Intent(this, RegisterToDoActivity.class);
        startActivity(i);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_editar:

                this.onBackPressed();

                Toast.makeText(this, "Editar", Toast.LENGTH_SHORT).show();

                break;

            case R.id.action_excluir:

                this.onBackPressed();

                Toast.makeText(this, "Excluir", Toast.LENGTH_SHORT).show();

                break;
        }

        return super.onOptionsItemSelected(item);
    }


}
