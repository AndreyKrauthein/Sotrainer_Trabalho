package com.example.sotrainertrabalho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.sotrainertrabalho.dao.AlunoAcademia
import com.example.sotrainertrabalho.model.Aluno

class TelaDeCadastroDeAluno: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_cadastro_de_aluno)
        configuraBotaoSalvar()
    }

    private fun configuraBotaoSalvar() {
        val dao = AlunoAcademia()
        findViewById<Button>(R.id.button_cadastrar_aluno).setOnClickListener {

            val aluno = criaAluno()

            dao.create(aluno)
            finish()
        }
    }

    private fun criaAluno(): Aluno {
        val nome = findViewById<EditText>(R.id.nome_completo).text.toString()
        val senha = findViewById<EditText>(R.id.senha).text.toString()

        return Aluno(
            nome = nome,
            senha = senha,
        )
    }
}