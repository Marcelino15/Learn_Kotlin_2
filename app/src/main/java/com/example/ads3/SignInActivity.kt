package com.example.ads3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_in.button3
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        button4.setOnClickListener {
            finish()
            startActivity(Intent(this, HomeActivity::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
