package com.elmernissi.myrestufinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.elmernissi.myrestufinder.MyAdapter.MyAdapter;
import com.elmernissi.myrestufinder.model.Magasin;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Magasin> magasins; 
    private Spinner citySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Exemple de données pour le RecyclerView
        magasins = new ArrayList<>();
        magasins.add(new Magasin("example 1","SAFI","06777777"));
        magasins.add(new Magasin("example 2","SALA","06777777"));
        magasins.add(new Magasin("example 3","RABAT","06777777"));
        magasins.add(new Magasin("example 1","SAFI","06777777"));
        magasins.add(new Magasin("example 2","SALA","06777777"));
        magasins.add(new Magasin("example 3","RABAT","06777777"));
        magasins.add(new Magasin("example 1","SAFI","06777777"));
        magasins.add(new Magasin("example 2","SALA","06777777"));
        magasins.add(new Magasin("example 3","RABAT","06777777"));
        adapter = new MyAdapter((ArrayList<Magasin>) magasins);
        recyclerView.setAdapter(adapter);


        //Declarer le Adapter et passer les données magasins


        //setAdapter(adapter) a le recyclerView


        // Initialiser le Spinner


        // Ajouter un écouteur de sélection au Spinner



    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


}