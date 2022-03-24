package com.example.sotrainertrabalho.model

import android.widget.Button
import android.widget.EditText

data class Aluno(
    val id: Int? = null,
    val nome_completo: String,
    var senha: String,
    var segunda: String,
    var terça: String,
    var quarta: String,
    var quinta: String,
    var sexta: String,
    var sabado: String
)