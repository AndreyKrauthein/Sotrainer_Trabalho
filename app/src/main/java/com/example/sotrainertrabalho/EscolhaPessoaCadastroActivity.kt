package com.example.sotrainertrabalho

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EscolhaPessoaCadastroActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_pessoa_cadastro)

        findViewById<Button>(R.id.academia).setOnClickListener {
            val intent = Intent(this, CadastroAcademiaActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.aluno).setOnClickListener {
            val intent = Intent(this, CadastroAlunoActivity::class.java)
            startActivity(intent)
        }
    }
}