package com.example.sotrainertrabalho.ui.recyclerviewadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sotrainertrabalho.R
import com.example.sotrainertrabalho.model.Aluno

class ListaDeAlunosAdapter(
    private val context: Context,
    produtos: List<Aluno>
) : RecyclerView.Adapter<ListaDeAlunosAdapter.ViewHolder>() {

    private val produtos = produtos.toMutableList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(aluno: Aluno){
            val nome = itemView.findViewById<TextView>(R.id.nome_completo)
            nome.text = aluno.nome

            var phone = itemView.findViewById<TextView>(R.id.senha)
            phone.text = aluno.senha.toString()


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.activity_tela_inicial_da_academia, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

    override fun getItemCount(): Int = produtos.size
    fun atualiza(produtos: List<Aluno>) {
        this.produtos.clear()
        this.produtos.addAll(produtos)
        notifyDataSetChanged()
    }
}