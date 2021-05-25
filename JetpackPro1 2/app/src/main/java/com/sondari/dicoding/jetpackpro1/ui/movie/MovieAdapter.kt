package com.sondari.dicoding.jetpackpro1.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sondari.dicoding.jetpackpro1.data.CatalogueData
import com.sondari.dicoding.jetpackpro1.databinding.ItemsMovieBinding

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun OnItemClicked(movies: CatalogueData)

    }

    fun setOnItemsClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    private var listMovies = ArrayList<CatalogueData>()

    inner class MovieViewHolder (private val binding: ItemsMovieBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(movies: CatalogueData){
            with(binding){
                tvItemTitle.text = movies.tittle
                tvItemDate.text = movies.dateline

                Glide.with(itemView.context)
                    .load(movies.imagePoster)
                    .apply(RequestOptions().override(100,100))
                    .into(imgMovie)
                itemView.setOnClickListener{
                    onItemClickCallback.OnItemClicked(movies)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsMoviesBinding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMoviesBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movies = listMovies[position]
        holder.bind(movies)
    }

    override fun getItemCount(): Int = listMovies.size

    fun setMovies(movies: List<CatalogueData>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

}