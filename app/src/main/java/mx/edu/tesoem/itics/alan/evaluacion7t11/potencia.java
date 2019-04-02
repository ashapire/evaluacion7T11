package mx.edu.tesoem.itics.alan.evaluacion7t11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class potencia extends AppCompatActivity {
    EditText numa;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);

        numa = (EditText) findViewById(R.id.editText6);
        res = (TextView) findViewById(R.id.textView6);

    }

    public void pot(View v){
        int a,c;
        a=Integer.parseInt(numa.getText().toString());
        c=a*a;
        res.setText(String.valueOf(c));
    }
}
