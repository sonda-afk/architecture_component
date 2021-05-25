package com.sondari.dicoding.jetpackpro1.ui.movie

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieVMTest {

    private lateinit var viewModel: MovieVM

    @Before
    fun setUp() {
        viewModel = MovieVM()
    }

    @Test
    fun getMovie() {
        val movie = viewModel.getMovie()
        assertNotNull(movie)
        assertEquals(10, movie.size)
    }
}