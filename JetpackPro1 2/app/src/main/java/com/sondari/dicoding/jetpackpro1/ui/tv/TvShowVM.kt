package com.sondari.dicoding.jetpackpro1.ui.tv

import androidx.lifecycle.ViewModel
import com.sondari.dicoding.jetpackpro1.data.CatalogueData
import com.sondari.dicoding.jetpackpro1.util.TvShowObject

class TvShowVM : ViewModel() {
    fun getTvShow() : List<CatalogueData> = TvShowObject.generateDummyTvShow()
}