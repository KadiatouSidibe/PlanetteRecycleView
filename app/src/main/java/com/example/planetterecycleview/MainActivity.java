package com.example.planetterecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MonRecycleViewAdapteur monRecycleViewAdapteur;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Data> donnees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        donnees = new ArrayList<>();
        donnees.add(new Data(R.drawable.mercury,"Mercure",15000));
        donnees.add(new Data(R.drawable.venus,"Venus",20000));
        donnees.add(new Data(R.drawable.earth,"Terre",25000));
        donnees.add(new Data(R.drawable.mars,"Mars",30000));
        donnees.add(new Data(R.drawable.jupiter,"Jupiter",35000));
        donnees.add(new Data(R.drawable.rhea,"Saturne",20000));
        donnees.add(new Data(R.drawable.uranus,"Uranus",40000));
        donnees.add(new Data(R.drawable.neptune,"Neptune",45000));
        donnees.add(new Data(R.drawable.pluto,"Pluton",50000));
        monRecycleViewAdapteur = new MonRecycleViewAdapteur(donnees);
        recyclerView.setAdapter(monRecycleViewAdapteur);
    }
}