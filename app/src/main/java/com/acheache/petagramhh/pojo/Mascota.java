package com.acheache.petagramhh.pojo;

/**
 * Created by CASTILLEJO on 17/07/2017.
 */

public class Mascota {
    private int id;
    private int foto;
    private String nombre;
    private int like;

    public Mascota(int id, int foto, String nombre, int like) {
        this.id = id;
        this.foto = foto;
        this.nombre = nombre;
        this.like = like;
    }

    public Mascota(int foto, String nombre, int like) {
        this.foto = foto;
        this.nombre = nombre;
        this.like = like;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
