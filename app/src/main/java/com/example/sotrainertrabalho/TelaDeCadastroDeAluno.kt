package com.example.sotrainertrabalho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.sotrainertrabalho.model.Aluno

class TelaDeCadastroDeAluno: AppCompatActivity(){
    private lateinit var editNomeCompleto: EditText
    private lateinit var editSenha: EditText
    private lateinit var editSegunda: EditText
    private lateinit var editTerça: EditText
    private lateinit var editQuarta: EditText
    private lateinit var editQuinta: EditText
    private lateinit var editSexta: EditText
    private lateinit var editSabado: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_cadastro_de_aluno)

        editNomeCompleto = findViewById<EditText>(R.id.aluno)
        editSenha = findViewById<EditText>(R.id.senha)
        editSegunda = findViewById<EditText>(R.id.segunda)
        editTerça = findViewById<EditText>(R.id.terça)
        editQuarta = findViewById<EditText>(R.id.quarta)
        editQuinta = findViewById<EditText>(R.id.quinta)
        editSexta = findViewById<EditText>(R.id.sexta)
        editSabado = findViewById<EditText>(R.id.sabado)
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


    }
}