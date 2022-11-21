package com.example.preparacaoteste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<teste> teste;
    private RecyclerView rcVista;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnInserir;
        testeDAO testeDAO = new testeDAO(this);
        btnInserir = findViewById(R.id.btnInserir);
        rcVista = findViewById(R.id.rcVista);
        rcVista = (RecyclerView) findViewById(R.id.rcVista);
        layoutManager = new LinearLayoutManager(this);
        rcVista.setLayoutManager(layoutManager);
        teste = testeDAO.getTeste();
        adapter = new RecyclerAdapter(teste);
        rcVista.setAdapter(adapter);


        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testeDAO.inserir(100, 190, 1);
                testeDAO.inserir(50, 250, 0);
                testeDAO.inserir(10, 100, 0);
            }
        });
    }

}