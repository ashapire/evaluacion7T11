package mx.edu.tesoem.itics.alan.evaluacion7t11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class suma extends AppCompatActivity {
EditText numa,numb;
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
    numa = (EditText) findViewById(R.id.editText2);
    numb = (EditText) findViewById(R.id.editText3);
    res = (TextView) findViewById(R.id.textView4);
    }

    public void suma(View v){
        int a,b,c;
        a=Integer.parseInt(numa.getText().toString());
        b=Integer.parseInt(numb.getText().toString());
        c=a+b;
        res.setText(String.valueOf(c));
    }
}
