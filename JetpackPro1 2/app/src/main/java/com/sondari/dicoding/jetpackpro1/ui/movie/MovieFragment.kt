package com.sondari.dicoding.jetpackpro1.ui.movie

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.sondari.dicoding.jetpackpro1.data.CatalogueData
import com.sondari.dicoding.jetpackpro1.databinding.FragmentMovieBinding
import com.sondari.dicoding.jetpackpro1.ui.detail.CatalogueDetail
import com.sondari.dicoding.jetpackpro1.util.MovieObject

class MovieFragment : Fragment() {

    private lateinit var fragmentMovieBinding: FragmentMovieBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        fragmentMovieBinding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val movies = MovieObject.generateDummyMovie()
            val movieAdapter = MovieAdapter()
            movieAdapter.setMovies(movies)

            with(fragmentMovieBinding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter

                movieAdapter.setOnItemsClickCallback(object : MovieAdapter.OnItemClickCallback {

                    override fun OnItemClicked(movies: CatalogueData) {
                        val intent = Intent(context, CatalogueDetail::class.java)
                        intent.putExtra(CatalogueDetail.EXTRA_USER, movies.id)
                        intent.putExtra(CatalogueDetail.EXTRA_CHECK, CatalogueDetail.EXTRA_MOVIE)
                        startActivity(intent)
                    }
                })
            }
        }
    }
}