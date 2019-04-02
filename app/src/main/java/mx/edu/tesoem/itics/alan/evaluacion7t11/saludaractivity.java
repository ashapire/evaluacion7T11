package mx.edu.tesoem.itics.alan.evaluacion7t11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class saludaractivity extends AppCompatActivity {

    TextView bienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludaractivity);

        Bundle parametros = this.getIntent().getExtras();

        bienvenida = (TextView) findViewById(R.id.textView3);
        bienvenida.setText("Bienvenido "+parametros.getString("nombre").toString());
    }
}
