package com.example.sotrainertrabalho.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class AlunosDatabase(
    context: Context
) : SQLiteOpenHelper(context, "alunos.db", null, 3) {
    override fun onCreate(db: SQLiteDatabase?) {
        val sql = """
            CREATE TABLE DB_ALUNOS(
                ID INTEGER PRIMARY KEY AUTOINCREMENT,
                NOME TEXT,
                SENHA TEXT,
                SEGUNDA TEXT,
                TERÇA TEXT,
                QUARTA TEXT,
                QUINTA TEXT,
                SEXTA TEXT,
                SABADO TEXT
            )
        """.trimIndent()

        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, newVersion: Int, oldVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS DB_ALUNOS")
        onCreate(db)
    }

}