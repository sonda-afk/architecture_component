package com.sondari.dicoding.jetpackpro1.ui.detail

import com.sondari.dicoding.jetpackpro1.util.MovieObject
import com.sondari.dicoding.jetpackpro1.util.TvShowObject
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class ViewModelCatalogueTest {

    private lateinit var viewModel: ViewModelCatalogue
    private val tv = TvShowObject.generateDummyTvShow()[0]
    private val movie = MovieObject.generateDummyMovie()[0]
    private val idTv = tv.id
    private val idMovie = movie.id

    @Before
    fun setUp() {
        viewModel = ViewModelCatalogue()
        viewModel.setSelectedCatalogue(idMovie)
        viewModel.setSelectedCatalogue(idTv)
    }

    @Test
    fun setSelectedCatalogue() {
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedCatalogue(movie.id)
        val gotMovie = viewModel.getMovie()
        assertNotNull(gotMovie)
        assertEquals(movie.id, gotMovie.id)
        assertEquals(movie.imagePoster, gotMovie.imagePoster)
        assertEquals(movie.dateline, gotMovie.dateline)
        assertEquals(movie.tittle, gotMovie.tittle)
        assertEquals(movie.score, gotMovie.score)
        assertEquals(movie.status, gotMovie.status)
        assertEquals(movie.description, gotMovie.description)
    }

    @Test
    fun getTvShow() {
        val gotTv = viewModel.getTvShow()
        viewModel.setSelectedCatalogue(tv.id)
        assertNotNull(gotTv)
        assertEquals(tv.id,gotTv.id)
        assertEquals(tv.imagePoster,gotTv.imagePoster)
        assertEquals(tv.dateline,gotTv.dateline)
        assertEquals(tv.tittle,gotTv.tittle)
        assertEquals(tv.score,gotTv.score)
        assertEquals(tv.status,gotTv.status)
        assertEquals(tv.description,gotTv.description)

    }
}