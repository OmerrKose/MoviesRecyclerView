package com.example.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        rv.LayoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        RecyclerView.Adapter = Adapter(getModels())
    }
    private fun getModels(): MutableList<Movies> {
        return mutableListOf(
            Movies(movieName = "Inception")
        )
    }
}