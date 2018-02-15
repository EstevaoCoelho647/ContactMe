package com.estevaocoelho.contactme

import android.content.Context
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

            val sharedPreferences = getSharedPreferences("USER_INFO", Context.MODE_PRIVATE)

            val edit = sharedPreferences.edit()
            edit.putString("USER_NAME", edit_text_user_name.text.toString())
            edit.putString("USER_IMAGE_URL", edit_text_image_url.text.toString())
            edit.apply()

            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}
