package com.mauriciolomba.desafiorecyclerview

import android.content.Context

class DataSource {

    fun loadMusics(context: Context): List<Music>{
        return listOf<Music>(
            Music("Californication", "03:20"),
            Music("Learn to Fly", "03:00"),
            Music("Wish you were here", "02:20"),
            Music("Animal", "03:00"),
            Music("Around the world", "03:20"),
            Music("With or without you", "02:20"),
            Music("Beautiful Day", "02:10"),
            Music("One", "05:00"),
            Music("Yellow", "04:00"),
            Music("A sky full of stars", "03:50"),
            Music("Yellow Submarine", "01:50"),
            Music("Adventure of a lifetime", "03:50"),
            Music("Viva la vida", "04:50"),
            Music("Trouble", "03:50"),
            Music("New Years Day", "03:50"),
            Music("I Still Haven't found what i'm looking for", "04:50")
        )
    }
}