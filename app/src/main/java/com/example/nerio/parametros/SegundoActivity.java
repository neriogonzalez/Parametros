package com.example.nerio.parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    private TextView TextView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        TextView1 = findViewById(R.id.textView2);
        String dato = getIntent().getStringExtra("dato");
        TextView1.setText("Hola " + dato);
    }

    //Método del botón regresar
    public void Regresar(View Vista) {
        Intent intento_regresar = new Intent(this, MainActivity.class);
        startActivity(intento_regresar);
    }
}
