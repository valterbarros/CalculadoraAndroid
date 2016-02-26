package com.example.valterb.calculadora;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    int Result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sum(View view){
        EditText n1 = (EditText) findViewById(R.id.n1);
        int N1num = Integer.parseInt(n1.getText().toString());
        EditText n2 = (EditText) findViewById(R.id.n2);
        int N2num = Integer.parseInt(n2.getText().toString());
        Result = N1num + N2num;
        Toast.makeText(this, "Resultado: " + Result, Toast.LENGTH_LONG).show();
    }

    public void sub(View view){
        EditText n1 = (EditText) findViewById(R.id.n1);
        int N1num = Integer.parseInt(n1.getText().toString());
        EditText n2 = (EditText) findViewById(R.id.n2);
        int N2num = Integer.parseInt(n2.getText().toString());
        Result = N1num - N2num;
        Toast.makeText(this, "Resultado: " + Result, Toast.LENGTH_LONG).show();
    }

    public void div(View view){
        EditText n1 = (EditText) findViewById(R.id.n1);
        int N1num = Integer.parseInt(n1.getText().toString());
        EditText n2 = (EditText) findViewById(R.id.n2);
        int N2num = Integer.parseInt(n2.getText().toString());
        Result = N1num / N2num;
        Toast.makeText(this, "Resultado: " + Result, Toast.LENGTH_LONG).show();
    }

    public void mult(View view){
        EditText n1 = (EditText) findViewById(R.id.n1);
        int N1num = Integer.parseInt(n1.getText().toString());
        EditText n2 = (EditText) findViewById(R.id.n2);
        int N2num = Integer.parseInt(n2.getText().toString());
        Result = N1num * N2num;
        Toast.makeText(this, "Resultado: " + Result, Toast.LENGTH_LONG).show();
    }

}
