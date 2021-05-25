package com.sondari.dicoding.jetpackpro1.ui.movie

import androidx.lifecycle.ViewModel
import com.sondari.dicoding.jetpackpro1.data.CatalogueData
import com.sondari.dicoding.jetpackpro1.util.MovieObject

class MovieVM : ViewModel() {
    fun getMovie() : List<CatalogueData> = MovieObject.generateDummyMovie()
}