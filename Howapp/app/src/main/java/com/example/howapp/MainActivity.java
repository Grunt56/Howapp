package com.example.howapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText cep;
    private EditText telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editNome);
        cep = findViewById(R.id.editCep);
        telefone = findViewById(R.id.editTelefone);
    }

    public void salvar(View view){
        Usuario a = new Usuario();
        a.setNome(nome.getText().toString());
        a.setCep(cep.getText().toString());
        a.setTelefone(telefone.getText().toString());

    }
}