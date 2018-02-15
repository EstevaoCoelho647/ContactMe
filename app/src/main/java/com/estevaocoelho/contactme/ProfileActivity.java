package com.estevaocoelho.contactme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by estevaocoelho on 15/02/18.
 */

public class ProfileActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        User userInfoFromSharedPreferences = SharedPreferencesUtil.getUserInfoFromSharedPreferences(this);

        TextView textViewUserName = findViewById(R.id.text_view_user_name);
        TextView textViewUserPhotoURL = findViewById(R.id.text_view_user_url);
        ImageView ImageViewUserPhoto = findViewById(R.id.user_image);

        textViewUserName.setText(userInfoFromSharedPreferences.getUserName());
        textViewUserPhotoURL.setText(userInfoFromSharedPreferences.getPhotoURL());
        Picasso.with(this).load(userInfoFromSharedPreferences.getPhotoURL()).into(ImageViewUserPhoto);
    }
}
