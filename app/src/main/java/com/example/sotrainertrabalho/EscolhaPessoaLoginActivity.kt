package com.example.sotrainertrabalho

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EscolhaPessoaLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_pessoa_login)

        findViewById<Button>(R.id.academia).setOnClickListener {
            val intent = Intent(this, LoginAcademiaActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.aluno).setOnClickListener {
            val intent = Intent(this, LoginAlunoActivity::class.java)
            startActivity(intent)
        }
    }
}