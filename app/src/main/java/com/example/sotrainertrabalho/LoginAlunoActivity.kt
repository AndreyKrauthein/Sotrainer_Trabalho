package com.example.sotrainertrabalho

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_aluno)


        findViewById<Button>(R.id.button_salvar).setOnClickListener {
            val intent = Intent(this, TelaInicialDoAluno::class.java)
            startActivity(intent)

        }
    }
}