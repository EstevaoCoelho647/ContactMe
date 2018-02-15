package com.estevaocoelho.contactme;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by estevaocoelho on 15/02/18.
 */

public class ProfileActivity extends AppCompatActivity {

    public static List<SocialMedia> socialMediaList = new ArrayList<>();
    SocialMediaAdapter socialMediaAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        User userInfoFromSharedPreferences = SharedPreferencesUtil.getUserInfoFromSharedPreferences(this);

        TextView textViewUserName = findViewById(R.id.text_view_user_name);
        TextView textViewUserPhotoURL = findViewById(R.id.text_view_user_url);
        ImageView ImageViewUserPhoto = findViewById(R.id.user_image);
        FloatingActionButton fab = findViewById(R.id.fab);
        ListView listView = findViewById(R.id.listView);

        textViewUserName.setText(userInfoFromSharedPreferences.getUserName());
        textViewUserPhotoURL.setText(userInfoFromSharedPreferences.getPhotoURL());
        Picasso.with(this).load(userInfoFromSharedPreferences.getPhotoURL()).into(ImageViewUserPhoto);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToNewSocialMediaActivity = new Intent(ProfileActivity.this, NewSocialMediaActivity.class);
                startActivity(goToNewSocialMediaActivity);
            }
        });

        socialMediaAdapter = new SocialMediaAdapter(socialMediaList);
        listView.setAdapter(socialMediaAdapter);
        socialMediaAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onResume() {
        super.onResume();
        socialMediaAdapter.notifyDataSetChanged();
    }
}
