package com.example.sotrainertrabalho

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginAcademiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_academia)


        findViewById<Button>(R.id.button_salvar).setOnClickListener {
            val intent = Intent(this, TelaInicialDaAcademiaActivity::class.java)
            startActivity(intent)
        }

    }
}