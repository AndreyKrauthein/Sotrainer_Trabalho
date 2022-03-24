package com.example.sotrainertrabalho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.sotrainertrabalho.dao.AlunoAcademia
import com.example.sotrainertrabalho.ui.recyclerviewadapter.ListaDeAlunosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TelaDeAlunos : AppCompatActivity() {


    val dao = AlunoAcademia()
    private val adapter = ListaDeAlunosAdapter(context = this, produtos = dao.getAll())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_alunos)
        configuraRecycleView()
    }

    override fun onResume() {
        super.onResume()
        adapter.atualiza(dao.getAll())

    }

    private fun configuraRecycleView() {
        val recyclerView = findViewById<RecyclerView>(R.id.activity_main_recyclerview)
        val dao = AlunoAcademia()
        recyclerView.adapter = adapter
    }


}
