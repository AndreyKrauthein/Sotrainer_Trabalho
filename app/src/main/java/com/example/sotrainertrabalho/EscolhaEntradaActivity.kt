package com.example.sotrainertrabalho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EscolhaEntradaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_entrada)

        findViewById<Button>(R.id.aluno).setOnClickListener {
            val intent = Intent(this, EscolhaPessoaLoginActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.academia).setOnClickListener {
            val intent = Intent(this, EscolhaPessoaCadastroActivity::class.java)
            startActivity(intent)
        }
    }
}