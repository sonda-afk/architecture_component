package com.sondari.dicoding.jetpackpro1.ui.detail

import androidx.lifecycle.ViewModel
import com.sondari.dicoding.jetpackpro1.data.CatalogueData
import com.sondari.dicoding.jetpackpro1.util.MovieObject
import com.sondari.dicoding.jetpackpro1.util.TvShowObject

class ViewModelCatalogue : ViewModel() {
    private var id: Int = 0

    fun setSelectedCatalogue(id: Int) {
        this.id = id
    }

    fun getMovie(): CatalogueData {
        lateinit var movies : CatalogueData
        val catalogueData = MovieObject.generateDummyMovie()
        for (data in catalogueData) {
            if (data.id == id) {
                movies = data
            }
        }
        return movies
    }

    fun getTvShow(): CatalogueData {
        lateinit var tv: CatalogueData
        val catalogueData = TvShowObject.generateDummyTvShow()
        for (data in catalogueData) {
            if (data.id == id) {
                tv = data
            }
        }
        return tv
    }

}