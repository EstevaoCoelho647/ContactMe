package com.estevaocoelho.contactme

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (SharedPreferencesUtil.hasUserInSharedPreferences(this)) {
            button_next.setOnClickListener({
                SharedPreferencesUtil.saveUserInfoInSharedPreferences(this, edit_text_user_name.text, edit_text_image_url.text)
                goToProfileActivity()
            })
        } else {
            goToProfileActivity()
        }
    }

    private fun goToProfileActivity() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
        finish()
    }
}
