package com.example.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val movieList : MutableList<Movies>) : RecyclerView.Adapter<Adapter.ModelViewHolder>() {
    class ModelViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val movieName : TextView = view.findViewById(R.id.movieName)
        private val director : TextView = view.findViewById(R.id.director)

        fun bindItems(item : Movies) {
            movieName.text = item.original_title
            director.text = item.director
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return ModelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.bindItems(movieList[position])
    }
}