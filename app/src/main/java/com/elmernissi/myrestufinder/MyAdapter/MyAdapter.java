package com.elmernissi.myrestufinder.MyAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elmernissi.myrestufinder.R;
import com.elmernissi.myrestufinder.model.Magasin;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewModel>{
    ArrayList<Magasin> data;

    public MyAdapter(ArrayList<Magasin> data) {

        this.data = data;
    }

    @NonNull
    @Override
    public ViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_magasin_item,parent,false);
        return new ViewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewModel holder, int position) {
        Magasin datas = data.get(position);
        holder.name.setText(datas.getNameRestaurant());
        holder.adresse.setText(datas.getAdressRestaurant());
        holder.telephon.setText(datas.getNbrTelephone());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewModel extends RecyclerView.ViewHolder{
        TextView name,adresse,telephon;

        public ViewModel(@NonNull View itemView) {

            super(itemView);
            name = itemView.findViewById(R.id.nomTextView);
            adresse =  itemView.findViewById(R.id.adresseTextView);
            telephon = itemView.findViewById(R.id.telephoneTextView);
        }
    }
}
