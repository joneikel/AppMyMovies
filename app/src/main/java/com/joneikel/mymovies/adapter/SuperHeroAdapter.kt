package com.joneikel.mymovies.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joneikel.mymovies.R
import com.joneikel.mymovies.SuperHero
import com.joneikel.mymovies.SuperheroProvaider

class SuperHeroAdapter(private val superheroList: List<SuperHero>) :
    RecyclerView.Adapter<SuperHeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layaoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layaoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount() = superheroList.size

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}