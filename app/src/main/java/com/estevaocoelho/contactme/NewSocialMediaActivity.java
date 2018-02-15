package com.estevaocoelho.contactme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by estevaocoelho on 15/02/18.
 */

public class NewSocialMediaActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.editTextNameToShow)
    EditText editTextNameToShow;
    @BindView(R.id.editTextMediaLink)
    EditText editTextMediaLink;
    @BindView(R.id.imageViewTumblr)
    ImageView imageViewTumblr;
    @BindView(R.id.imageViewFacebook)
    ImageView imageViewFacebook;
    @BindView(R.id.imageViewTwitter)
    ImageView imageViewTwitter;
    @BindView(R.id.imageViewLinkedin)
    ImageView imageViewLinkedin;
    @BindView(R.id.imageViewInstagram)
    ImageView imageViewInstagram;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_social_media);

        ButterKnife.bind(this);

        imageViewFacebook.setOnClickListener(this);
        imageViewInstagram.setOnClickListener(this);
        imageViewLinkedin.setOnClickListener(this);
        imageViewTumblr.setOnClickListener(this);
        imageViewTwitter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageViewFacebook:

                break;
            case R.id.imageViewInstagram:

                break;
            case R.id.imageViewLinkedin:

                break;
            case R.id.imageViewTumblr:

                break;
            case R.id.imageViewTwitter:

                break;
        }
    }
}
