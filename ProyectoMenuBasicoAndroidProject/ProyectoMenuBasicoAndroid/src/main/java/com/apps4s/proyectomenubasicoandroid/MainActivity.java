package com.apps4s.proyectomenubasicoandroid;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView foto = (ImageView) findViewById(R.id.foto);
        foto.setImageResource(R.drawable.megan);

        Spinner spinner = (Spinner) findViewById(R.id.spinner01);
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.peliculas,android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        AlertDialog alerta = new AlertDialog.Builder(this).create();
        alerta.setTitle(getString(R.string.tituloAlerta));
        //alerta.setButton("OK""Nada");

        switch (item.getItemId()) {
            case R.id.m_inicio:
                alerta.setMessage(getString(R.string.m_inicio));
                break;
            case R.id.m_editar:
                alerta.setMessage(getString(R.string.m_editar));
                break;
            case R.id.m_about:
                alerta.setMessage(getString(R.string.m_about));
                break;
        }
        alerta.show();
        return false;
    }
}
