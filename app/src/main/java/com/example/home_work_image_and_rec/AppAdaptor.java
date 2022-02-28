package com.example.home_work_image_and_rec;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work_image_and_rec.databinding.ItemBinding;

import java.util.ArrayList;

public class AppAdaptor extends  RecyclerView.Adapter<AppAdaptor.AppViewHolder>{
    private ArrayList<App> data;
    private OnClick onClick;

    public AppAdaptor(ArrayList<App> data, OnClick onClick) {
        this.data = data;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AppViewHolder(ItemBinding.inflate(LayoutInflater.from
                (parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class AppViewHolder extends RecyclerView.ViewHolder{
        private ItemBinding binding;
        public AppViewHolder(@NonNull ItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(App apps) {
            binding.textCountry.setText(apps.getName());
            binding.textCity.setText(apps.getUnderName());
            binding.textNum.setText(apps.getNum());
            binding.textTime.setText(apps.getTime());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClick.onClick(data.get(getAdapterPosition()));
                }
            });
        }
    }
}
