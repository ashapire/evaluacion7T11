package mx.edu.tesoem.itics.alan.evaluacion7t11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
    }

    public void llamarp(View v){
        Intent intent = new Intent(this,suma.class);
        startActivity(intent);
    }
    public void llamarpo(View v){
        Intent intent = new Intent(this,resta.class);
        startActivity(intent);
    }
    public void llamarpa(View v){
        Intent intent = new Intent(this,potencia.class);
        startActivity(intent);
    }
    public void llamarpi(View v){
        System.exit(0);
    }

}
