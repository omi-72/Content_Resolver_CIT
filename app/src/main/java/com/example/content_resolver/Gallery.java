package com.example.content_resolver;

import android.net.Uri;

public class Gallery {

    long id;
    String name;
    Uri imageUri;

    public Gallery(long id, String name, Uri imageUri) {
        this.id = id;
        this.name = name;
        this.imageUri = imageUri;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }
}
