package com.example.ads3

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tv_blog.setOnClickListener {
            startActivity(Intent(this,BlogActivity::class.java))
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Konfirmasi")
            .setMessage("Apakah Anda ingin keluar dari aplikasi?")
            .setPositiveButton("Ya",{dialog: DialogInterface?, which: Int ->
                Toast.makeText(this, "Terimakasih telah menggunakan Aplikasi My Financial",
                    Toast.LENGTH_SHORT).show()
                finish()
            })
            .setNegativeButton("Batal",{dialog: DialogInterface?, which: Int ->

            }).show()
    }
}
