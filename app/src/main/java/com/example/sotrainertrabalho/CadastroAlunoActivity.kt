package com.example.sotrainertrabalho

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CadastroAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_aluno)

        findViewById<Button>(R.id.button_salvar).setOnClickListener {
            val c = findViewById<EditText>(R.id.cnpj).text.toString()
            val senha = findViewById<EditText>(R.id.senha).text.toString()


        }
    }
}