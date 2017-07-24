package com.acheache.petagramhh.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.acheache.petagramhh.FavoritePets;
import com.acheache.petagramhh.R;
import com.acheache.petagramhh.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by CASTILLEJO on 22/07/2017.
 */

public class FavoritePetsAdapter extends RecyclerView.Adapter<FavoritePetsAdapter.FavoriteViewHolder>
{
    ArrayList<Mascota> mascotas;

    public FavoritePetsAdapter(ArrayList<Mascota> mascotas){
        this.mascotas=mascotas;
    }

    @Override
    public FavoriteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new FavoritePetsAdapter.FavoriteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FavoriteViewHolder  favoriteViewHolder, int position) {
        Mascota mascota=mascotas.get(position);
        favoriteViewHolder.cardImagen.setImageResource(mascota.getFoto());
        favoriteViewHolder.cardNombre.setText(mascota.getNombre());
        favoriteViewHolder.coutLike.setText(String.valueOf(mascota.getLike()));

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class FavoriteViewHolder extends RecyclerView.ViewHolder{
        private ImageView cardImagen;
        private TextView cardNombre;
        private TextView coutLike;
        public FavoriteViewHolder(View itemView) {
            super(itemView);
            cardImagen=(ImageView)itemView.findViewById(R.id.cardImagen);
            cardNombre=(TextView)itemView.findViewById(R.id.cardNombre);
            coutLike=(TextView)itemView.findViewById(R.id.countLike);
        }
    }
}
