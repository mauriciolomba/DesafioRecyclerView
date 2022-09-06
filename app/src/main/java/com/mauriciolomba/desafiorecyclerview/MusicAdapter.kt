package com.mauriciolomba.desafiorecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter (
    private val dataset: List<Music>,
    private val onItemClicked: (Music) -> Unit
    ): RecyclerView.Adapter<MusicAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val musicNameTextView: TextView = view.findViewById(R.id.music_name)
        val musicTimeTextView: TextView = view.findViewById(R.id.music_time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_music, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.musicNameTextView.text = item.name
        holder.musicTimeTextView.text = item.duration

        holder.itemView.setOnClickListener{
            onItemClicked(item)
        }
    }

    override fun getItemCount() = dataset.size
}