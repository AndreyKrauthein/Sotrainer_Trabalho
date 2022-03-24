package com.example.sotrainertrabalho.dao

import com.example.sotrainertrabalho.model.Aluno as Aluno


class AlunoAcademia {
    fun create(aluno: Aluno){
        alunosAdapter.add(aluno)


    }

    fun getAll() : List<Aluno> {
        return  alunosAdapter.toList()
    }

    companion object {
        private val alunosAdapter = mutableListOf<Aluno>()
    }
}