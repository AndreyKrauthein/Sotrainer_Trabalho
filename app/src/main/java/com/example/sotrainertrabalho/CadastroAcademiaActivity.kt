package com.example.sotrainertrabalho

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CadastroAcademiaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_academia)

        findViewById<Button>(R.id.button_salvar).setOnClickListener {
            val cnpj = findViewById<EditText>(R.id.cnpj).text.toString()
            val senha = findViewById<EditText>(R.id.senha).text.toString()

            val intent = Intent(this, TelaInicialDaAcademiaActivity::class.java)
            startActivity(intent)
        }
    }
}
