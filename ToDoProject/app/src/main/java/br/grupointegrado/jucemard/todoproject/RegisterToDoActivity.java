package br.grupointegrado.jucemard.todoproject;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RegisterToDoActivity extends AppCompatActivity {

    private Spinner spnCategoria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_to_do);

        List<String> categoria = new ArrayList<>();
        categoria.add("Faculdade");
        categoria.add("Trabalho");
        categoria.add("Sei lรก !");

        spnCategoria = (Spinner) findViewById(R.id.spnCategoria);

        ArrayAdapter<String> aaCategoria = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, categoria);

        spnCategoria.setAdapter(aaCategoria);

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

                Toast.makeText(this, "Salvar", Toast.LENGTH_SHORT).show();

                break;

            case R.id.action_cancelar:

                Toast.makeText(this, "Cancelar", Toast.LENGTH_SHORT).show();

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
