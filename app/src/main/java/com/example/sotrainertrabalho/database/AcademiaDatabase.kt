package com.example.sotrainertrabalho.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class AcademiaDatabase(
    context: Context
) : SQLiteOpenHelper(context, "alunos.db", null, 3) {
    override fun onCreate(db: SQLiteDatabase?) {
        val sql = """
            CREATE TABLE DB_ACADEMIA(
                ID INTEGER PRIMARY KEY AUTOINCREMENT,
                CNPJ TEXT,
                SENHA TEXT 
            )
        """.trimIndent()

        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, newVersion: Int, oldVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS DB_ACADEMIA")
        onCreate(db)
    }

}