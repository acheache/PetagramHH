package com.acheache.petagramhh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.acheache.petagramhh.adapter.FavoritePetsAdapter;
import com.acheache.petagramhh.adapter.PetAdapter;
import com.acheache.petagramhh.pojo.Mascota;

import java.util.ArrayList;

public class FavoritePets extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView recyclerView;
    private AppCompatImageView mascotasFav;
    MainActivity mainActivity=new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_pets);


        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionbarFav);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        enlazarVistaControlador(toolbar);


        recyclerView=(RecyclerView)findViewById(R.id.rvFavoritePets);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

       // GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);

        recyclerView.setLayoutManager(linearLayoutManager);



        //mainActivity.inicializarListaMascotas();
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    private void enlazarVistaControlador(Toolbar toolbar) {
        ImageView estrella;
        estrella=(ImageView)findViewById(R.id.mascotasFav);
        //mascotasFav =  toolbar.findViewById(R.id.mascotasFav);
       estrella.setVisibility(View.GONE);
    }

    public void inicializarAdaptador(){
        FavoritePetsAdapter adaptador=new FavoritePetsAdapter(mascotas);
        recyclerView.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas=new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.pet01,"Neron",2));
        mascotas.add(new Mascota(R.drawable.pet02,"Loki",1));
        mascotas.add(new Mascota(R.drawable.pet03,"Yango",8));
        mascotas.add(new Mascota(R.drawable.pet04,"Bik Show",7));
        mascotas.add(new Mascota(R.drawable.pet05,"Fido",3));
        mascotas.add(new Mascota(R.drawable.pet06,"Neron01",5));
        mascotas.add(new Mascota(R.drawable.pet07,"Neron02",9));

    }
}
