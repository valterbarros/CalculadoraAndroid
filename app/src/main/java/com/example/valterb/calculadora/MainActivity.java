package com.example.valterb.calculadora;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    int Result = 0;
    int n1 = 0;
    int n2 = 0;
    int op = 0;
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext= (EditText) findViewById(R.id.edittext);
    }

    public void calc(View view){
        try {
            n1 = Integer.parseInt(edittext.getText().toString());
            edittext.setText("");
            op = view.getId();
        }catch(Exception e){
            Toast.makeText(this,"Vamos com calma ai! ", Toast.LENGTH_SHORT).show();
        }
    }

    public void result(View view) {
        try {
            String erro = "";
            n2 = Integer.parseInt(edittext.getText().toString());

            switch (op) {
                case R.id.sum:
                    Result = n1 + n2;
                    edittext.setText(String.valueOf(Result));
                    break;
                case R.id.sub:
                    Result = n1 - n2;
                    edittext.setText(String.valueOf(Result));
                    break;
                case R.id.div:
                    try {
                        Result = n1 / n2;
                        edittext.setText(String.valueOf(Result));
                    } catch (Exception e) {
                        erro = "Cannot Divide!";
                        edittext.setText(erro);
                    }
                    break;
                case R.id.mult:
                    Result = n1 * n2;
                    edittext.setText(String.valueOf(Result));
                    break;
            }

        }catch(Exception e){
            Toast.makeText(this,"Vamos com calma ai! ", Toast.LENGTH_SHORT).show();
        }
    }

    public void cc(View view) {
        edittext.setText("");
    }

}
