package com.example.ptsgenap10rpl121;

import android.graphics.drawable.Drawable;

public class Makanan {
    private String judul, deskripsi;
    private Drawable foto;

    public Makanan(Drawable foto, String judul, String deskripsi) {
        this.foto = foto;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Drawable getFoto() {
        return foto;
    }

    public void setFoto(Drawable foto) {
        this.foto = foto;
    }
}
