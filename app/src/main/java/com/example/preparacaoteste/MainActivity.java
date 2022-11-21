package com.example.preparacaoteste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnInserir;
        RecyclerView rcVista;

        btnInserir = findViewById(R.id.btnInserir);
        rcVista = findViewById(R.id.rcVista);

        testeDAO testeDAO = new testeDAO(this);

        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testeDAO.inserir(100, 200, 1);
                testeDAO.inserir(50, 250, 0);
                testeDAO.inserir(10, 100, 0);
            }
        });

    }
}