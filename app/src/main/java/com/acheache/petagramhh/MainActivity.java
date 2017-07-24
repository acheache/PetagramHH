package com.acheache.petagramhh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.acheache.petagramhh.adapter.PetAdapter;
import com.acheache.petagramhh.pojo.Mascota;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionbar);
        setSupportActionBar(toolbar);

        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView=(RecyclerView)findViewById(R.id.rvMascota);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);

        recyclerView.setLayoutManager(linearLayoutManager);

        inicializarListaMascotas();
        inicializarAdaptador();

    }


    public void inicializarAdaptador(){
        PetAdapter adaptador=new PetAdapter(mascotas,this);
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


    private void iraA(Class<?> clase) {
        Intent i = new Intent(MainActivity.this, clase);
        startActivity(i);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mascotasFav:
                iraA(FavoritePets.class);
                break;
        }
    }


    public void ok(View view){
        switch (view.getId()) {
            case R.id.mascotasFav:
                Intent explicit_intent = new Intent(this,FavoritePets.class);
                startActivity(explicit_intent);
                break;
        }


    }

}
