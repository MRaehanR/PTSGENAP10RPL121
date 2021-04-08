package com.example.ptsgenap10rpl121;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MakananActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MakananAdapter makananAdapter;
    private ArrayList<Makanan> makananArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        addData();

        recyclerView = findViewById(R.id.recyclerview);
        makananAdapter = new MakananAdapter(makananArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MakananActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(makananAdapter);

        makananAdapter.setOnItemClickListener(new MakananAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getApplicationContext(), "You clicked "+ makananArrayList.get(position).getJudul(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addData() {
        makananArrayList = new ArrayList<>();
        makananArrayList.add(new Makanan(getResources().getDrawable(R.drawable.megono), "Nasi Megono", "Nasi megono adalah makanan khas dari daerah pantura Jawa Tengah. Makanan ini biasa ditemukan dan sangat familiar di daerah Kabupaten Pekalongan, Kota Pekalongan, Kabupaten Batang, sampai Kabupaten Pemalang."));
        makananArrayList.add(new Makanan(getResources().getDrawable(R.drawable.keraktelor), "Kerak Telor", "Kerak telur adalah makanan asli daerah Jakarta, dengan bahan-bahan beras ketan putih, telur ayam atau bebek, ebi yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir."));
    }

}