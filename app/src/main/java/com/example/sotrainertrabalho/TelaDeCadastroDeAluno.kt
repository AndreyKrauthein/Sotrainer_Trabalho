package com.example.sotrainertrabalho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.sotrainertrabalho.database.AlunosDatabase
import com.example.sotrainertrabalho.database.salvarAlunos
import com.example.sotrainertrabalho.model.Aluno

class TelaDeCadastroDeAluno: AppCompatActivity() {
    private lateinit var editNomeCompleto: EditText
    private lateinit var editSenha: EditText
    private lateinit var editSegunda: EditText
    private lateinit var editTerça: EditText
    private lateinit var editQuarta: EditText
    private lateinit var editQuinta: EditText
    private lateinit var editSexta: EditText
    private lateinit var editSabado: EditText

    private lateinit var database: AlunosDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_cadastro_de_aluno)

        editNomeCompleto = findViewById<EditText>(R.id.nome_completo)
        editSenha = findViewById<EditText>(R.id.senha)
        editSegunda = findViewById<EditText>(R.id.segunda)
        editTerça = findViewById<EditText>(R.id.terça)
        editQuarta = findViewById<EditText>(R.id.quarta)
        editQuinta = findViewById<EditText>(R.id.quinta)
        editSexta = findViewById<EditText>(R.id.sexta)
        editSabado = findViewById<EditText>(R.id.sabado)

        database = AlunosDatabase(this)

        findViewById<Button>(R.id.button_cadastrar_aluno).setOnClickListener {
            salvarAluno()
        }
    }

    private fun salvarAluno() {
        val aluno = Aluno(
            nome_completo = editNomeCompleto.text.toString(),
            senha = editSenha.text.toString(),
            segunda = editSegunda.text.toString(),
            terça = editTerça.text.toString(),
            quarta = editQuarta.text.toString(),
            quinta = editQuinta.text.toString(),
            sexta = editSexta.text.toString(),
            sabado = editSabado.text.toString()
        )

        val idAluno = database.salvarAlunos(aluno)

        if (idAluno == -1L) {
            Toast.makeText(this, "Erro ao inserir", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Aluno Criado com Sucesso", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, TelaInicialDaAcademiaActivity::class.java)
            startActivity(intent)
        }


    }
}