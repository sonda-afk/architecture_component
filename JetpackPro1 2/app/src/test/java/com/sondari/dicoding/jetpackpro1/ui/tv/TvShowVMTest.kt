package com.sondari.dicoding.jetpackpro1.ui.tv

import com.sondari.dicoding.jetpackpro1.ui.movie.MovieVM
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowVMTest {

    private lateinit var viewModel: TvShowVM

    @Before
    fun setUp() {
        viewModel = TvShowVM()
    }

    @Test
    fun getMovie() {
        val movie = viewModel.getTvShow()
        assertNotNull(movie)
        assertEquals(10, movie.size)
    }
}