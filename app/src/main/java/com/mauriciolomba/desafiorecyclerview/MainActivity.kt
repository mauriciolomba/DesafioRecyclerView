package com.mauriciolomba.desafiorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val musicList = DataSource().loadMusics(this)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = MusicAdapter(musicList){ music ->
            Toast.makeText(this, "'${music.name}' clicked", Toast.LENGTH_SHORT).show()
        }
    }
}