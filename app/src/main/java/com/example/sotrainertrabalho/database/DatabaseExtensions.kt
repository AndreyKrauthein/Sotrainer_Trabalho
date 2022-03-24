package com.example.sotrainertrabalho.database

import android.content.ContentValues
import com.example.sotrainertrabalho.model.Aluno

fun AlunosDatabase.salvarAlunos(item: Aluno): Long {
    val idAluno = writableDatabase.insert("DB_ALUNOS", null, ContentValues().apply {
        put("NOME", item.nome_completo)
        put("SENHA", item.senha)
        put("SEGUNDA", item.segunda)
        put("TERÇA", item.terça)
        put("QUARTA", item.quarta)
        put("QUINTA", item.quinta)
        put("SEXTA", item.sexta)
        put("SABADO", item.sabado)
    })
    return idAluno
}