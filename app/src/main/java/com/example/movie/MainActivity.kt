package com.example.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        val moviesAdapter = Adapter(getModels())
        rv.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            adapter = moviesAdapter
        }
    }

    private fun getModels(): MutableList<Movies> {
        return mutableListOf(
            Movies(title = "Inception", director = "Christopher Nolan", id = 1),
            Movies(title = "The Dark Knight Rises", director = "Christopher Nolan", id = 2),
            Movies(title = "Prestige", director = "Christopher Nolan", id = 3),
            Movies(title = "Gladiator", director = "Ridley Scott", id = 4)
        )
    }
}