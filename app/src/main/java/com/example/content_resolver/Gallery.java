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
}
