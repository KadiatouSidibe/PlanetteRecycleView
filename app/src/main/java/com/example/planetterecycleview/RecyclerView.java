package com.example.planetterecycleview;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.ArrayList;

class MonRecycleViewAdapteur extends androidx.recyclerview.widget.RecyclerView.Adapter<MonRecycleViewAdapteur.ConteneurDeDonnee> {
    private ArrayList<Data> donnees;
    public MonRecycleViewAdapteur(ArrayList<Data> donnees) {
        this.donnees = donnees;
    }

    @Override
    public ConteneurDeDonnee onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_view_item, parent, false);
        return new ConteneurDeDonnee(view);
    }

    @Override
    public void onBindViewHolder(ConteneurDeDonnee conteneur, int position) {
        conteneur.nom.setText(donnees.get(position).getNom());
        conteneur.taille.setText(donnees.get(position).getTaille()+"");
        conteneur.imageView.setImageResource(donnees.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return donnees.size();
    }

    public class ConteneurDeDonnee extends androidx.recyclerview.widget.RecyclerView.ViewHolder{
        TextView nom;
        TextView taille;
        ImageView imageView;

        public ConteneurDeDonnee(View itemView) {
            super(itemView);
            nom = (TextView) itemView.findViewById(R.id.name);
            taille = (TextView) itemView.findViewById(R.id.size);
            imageView=itemView.findViewById(R.id.image);

        }



    }



}

