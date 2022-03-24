package com.example.sotrainertrabalho

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sotrainertrabalho.database.AcademiaDatabase
import com.example.sotrainertrabalho.model.Academia

private lateinit var database: AcademiaDatabase


class CadastroAcademiaActivity: AppCompatActivity() {
    private lateinit var editCnpj: EditText
    private lateinit var editSenha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_academia)
        editCnpj = findViewById<EditText>(R.id.cnpj)
        editSenha = findViewById<EditText>(R.id.senha)

        database= AcademiaDatabase(this)

        findViewById<Button>(R.id.button_salvar).setOnClickListener {
            salvarAcademia()

        }

    }

    private fun salvarAcademia(){
        val academia=Academia(
            cnpj = editCnpj.text.toString(),
            senha= editSenha.text.toString()
        )
        }
    }

