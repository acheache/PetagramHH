package com.acheache.petagramhh.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.acheache.petagramhh.R;
import com.acheache.petagramhh.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by CASTILLEJO on 19/07/2017.
 */

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;

    public PetAdapter(ArrayList<Mascota> mascotas,Activity activity){
        this.mascotas=mascotas;
        this.activity=activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota=mascotas.get(position);
        mascotaViewHolder.cardImagen.setImageResource(mascota.getFoto());
        mascotaViewHolder.cardNombre.setText(mascota.getNombre());
        mascotaViewHolder.coutLike.setText(String.valueOf(mascota.getLike()));
        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Diste como tu favorito a: "+  mascota.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView cardImagen;
        private TextView cardNombre;
        private TextView coutLike;
        private ImageButton btnLike;
        public MascotaViewHolder(View itemView) {
            super(itemView);
            cardImagen=(ImageView)itemView.findViewById(R.id.cardImagen);
            cardNombre=(TextView)itemView.findViewById(R.id.cardNombre);
            coutLike=(TextView)itemView.findViewById(R.id.countLike);
            btnLike=(ImageButton)itemView.findViewById(R.id.addFav);
        }
    }
}
