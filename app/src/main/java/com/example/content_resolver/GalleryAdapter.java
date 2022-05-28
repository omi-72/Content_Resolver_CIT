package com.example.content_resolver;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryViewHolder> {

    Context context;
    List<Gallery> galleryList;

    public GalleryAdapter(Context context, List<Gallery> galleryList) {
        this.context = context;
        this.galleryList = galleryList;
    }

    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_image,parent,false);

        return new GalleryViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder holder, int position) {

        Gallery gallery= galleryList.get(position);

        holder.g_image_name.setText(gallery.getName());
        holder.g_image.setImageURI(gallery.getImageUri());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,FullActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return galleryList.size();
    }
}
