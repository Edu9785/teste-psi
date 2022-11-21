package com.example.preparacaoteste;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<teste> teste;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNumeroUm, txtNumeroDois;
        public Button btnEliminar, btnDetalhes;
        public ImageView img;

        public ViewHolder(View view){
            super(view);
            txtNumeroUm = (TextView) view.findViewById(R.id.txtNumeroUm);
            txtNumeroDois = (TextView) view.findViewById(R.id.txtNumeroDois);
            btnEliminar = (Button) view.findViewById(R.id.btnEliminar);
            btnDetalhes = (Button) view.findViewById(R.id.btnDetalhes);
            img = (ImageView) view.findViewById(R.id.img);
        }
    }

    public RecyclerAdapter (ArrayList<teste> teste){
        this.teste = teste;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int Viewtype){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        holder.txtNumeroUm.setText(String.valueOf(teste.get(position).numeroUm));
        holder.txtNumeroDois.setText(String.valueOf(teste.get(position).numeroDois));
        if(teste.get(position).verificacao == 1)
        {
            holder.img.setImageResource(R.drawable.sim);
        }
        else
        {
            holder.img.setImageResource(R.drawable.nao);
        }

        holder.btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {return teste.size();}
}
