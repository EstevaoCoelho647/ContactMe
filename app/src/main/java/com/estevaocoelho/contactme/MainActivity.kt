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

        button_next.setOnClickListener({
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()

            SharedPreferencesUtil.saveUserInfoInSharedPreferences(this, edit_text_user_name.text, edit_text_image_url.text)

            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}
