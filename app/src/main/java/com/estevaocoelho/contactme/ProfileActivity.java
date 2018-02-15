package com.estevaocoelho.contactme;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by estevaocoelho on 15/02/18.
 */

public class ProfileActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        SharedPreferences userSharedPrefs = getSharedPreferences("USER_INFO", Context.MODE_PRIVATE);
        String userName = userSharedPrefs.getString("USER_NAME", "");
        String userImageUrl = userSharedPrefs.getString("USER_IMAGE_URL", "");

        TextView textViewUserName = findViewById(R.id.text_view_user_name);
        TextView textViewUserPhotoURL = findViewById(R.id.text_view_user_url);

        textViewUserName.setText(userName);
        textViewUserPhotoURL.setText(userImageUrl);
    }
}
