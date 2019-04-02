package mx.edu.tesoem.itics.alan.evaluacion7t11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button saludarbtn,boton;
    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        boton = (Button) findViewById(R.id.button2);
        saludarbtn = (Button) findViewById(R.id.button);
        saludarbtn.setOnClickListener(this);

        txtnombre=(EditText) findViewById(R.id.editText);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Bienvenido a mi examen :`v", Toast.LENGTH_LONG).show();
        saludarbtn.setEnabled(true);
    }

    public void llamarp(View v){
        Intent intent = new Intent(this,saludaractivity.class);
        intent.putExtra("nombre", txtnombre.getText().toString());
        startActivity(intent)
        ;

    }

    public void operaciones(View v){
        Intent llamar = new Intent(this,operaciones.class);
        startActivity(llamar);
    }

}
