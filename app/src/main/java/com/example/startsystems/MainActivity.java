package com.example.startsystems;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tView;
    EditText tall;
    public EditText peso;
    public EditText est;
    public String men;
    public String result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btnClick);
        tView = (TextView)findViewById(R.id.txtResult);

        men = "Tu imc es: ";

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
            }

            private void fun() {

                tall = (EditText)findViewById(R.id.tall);
                peso = (EditText)findViewById(R.id.peso);
                est = (EditText)findViewById(R.id.est);

                double num1 = Integer.parseInt(peso.getText().toString());
                double num3 = Integer.parseInt(est.getText().toString());
                double S0 = Double.parseDouble(est.getText().toString());
                double num4 = S0 * S0;
                double tot;
                tot = (num1 / (num4));
                
                if (tot > 18.5){
                    result = "Normal";
                }
                if (tot > 25){
                    result = "Sobrepeso";
                }
                if (tot > 40){
                    result = "Obesidad";
                }
                Context  context = getApplicationContext();
                CharSequence text = men + result;
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text ,duration);
                toast.setGravity(Gravity.CENTER, 0, 0 );
                toast.show();
                }

        });

    }
}