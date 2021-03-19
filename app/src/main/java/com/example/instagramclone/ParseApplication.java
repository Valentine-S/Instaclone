package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8YdoNiFsij1Fh4blyNpb9cxfxN1gDuNIxoakoReo")
                .clientKey("4tCef6YU8DMHKdegHDsCVzy5DR5uVZsiICO0lxJw")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
