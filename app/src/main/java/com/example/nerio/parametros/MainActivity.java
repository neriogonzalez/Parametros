package com.example.nerio.parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText EditText1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText1 = findViewById(R.id.editText);
    }

    public void Enviar (View vista) {
        Intent intento = new Intent(this, SegundoActivity.class);
        intento.putExtra("dato", EditText1.getText().toString());
        startActivity(intento);
    }
}
