package com.example.sotrainertrabalho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaInicialDaAcademiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial_da_academia)

        findViewById<Button>(R.id.button_cadastrar_aluno).setOnClickListener {
            val intent = Intent(this, TelaDeCadastroDeAluno::class.java)
            startActivity(intent)

        }
    }
}