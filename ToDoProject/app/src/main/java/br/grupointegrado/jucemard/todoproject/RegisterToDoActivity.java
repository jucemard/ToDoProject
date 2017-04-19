package br.grupointegrado.jucemard.todoproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import br.grupointegrado.jucemard.todoproject.bd.DataBase;
import br.grupointegrado.jucemard.todoproject.model.Categoria;
import br.grupointegrado.jucemard.todoproject.model.ToDo;

public class RegisterToDoActivity extends AppCompatActivity {

    private EditText edtDescricao;
    private EditText edtDataEntrega;
    private RatingBar rbPrioridade;
    private Spinner spnCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_to_do);

        edtDescricao = (EditText) findViewById(R.id.edtDescricao);
        edtDataEntrega = (EditText) findViewById(R.id.edtDataEntrega);
        rbPrioridade = (RatingBar) findViewById(R.id.rbPrioridade);

        List<Categoria> categoria = Arrays.asList(Categoria.values());

        spnCategoria = (Spinner) findViewById(R.id.spnCategoria);

        ArrayAdapter<Categoria> aaCategoria = new ArrayAdapter<Categoria>(this,
                android.R.layout.simple_list_item_1, categoria);

        spnCategoria.setAdapter(aaCategoria);

    }

    public ToDo getToDo () {
        ToDo todo = new ToDo();

        todo.setDescricao(edtDescricao.getText().toString());
        todo.setEntrega(edtDataEntrega.getText().toString());
        todo.setPrioridade(rbPrioridade.getNumStars());

        todo.setCategoria((Categoria) spnCategoria.getSelectedItem());

        return todo;
    }

    public void limpaActivity () {
        edtDescricao.setText("");
        edtDataEntrega.setText("");
        rbPrioridade.setRating(0);

        spnCategoria.setSelection(0);

        edtDescricao.requestFocus();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_padrao, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_salvar:

                //Usando o método
                ToDo todo = this.getToDo();

                DataBase db = new DataBase(this);
                db.insert(todo);

                this.limpaActivity();
                this.onBackPressed();

                Toast.makeText(this, "Salvar", Toast.LENGTH_SHORT).show();

                break;

            case R.id.action_cancelar:

                this.onBackPressed();

                Toast.makeText(this, "Cancelar", Toast.LENGTH_SHORT).show();

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
