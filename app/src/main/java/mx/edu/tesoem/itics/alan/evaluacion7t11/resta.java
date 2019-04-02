package mx.edu.tesoem.itics.alan.evaluacion7t11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resta extends AppCompatActivity {
    EditText numa,numb;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        numa = (EditText) findViewById(R.id.editText4);
        numb = (EditText) findViewById(R.id.editText5);
        res = (TextView) findViewById(R.id.textView5);
    }

    public void resta(View v){
        int a,b,c;
        a=Integer.parseInt(numa.getText().toString());
        b=Integer.parseInt(numb.getText().toString());
        c=a-b;
        res.setText(String.valueOf(c));
    }
}
