package com.sondari.dicoding.jetpackpro1.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sondari.dicoding.jetpackpro1.R
import com.sondari.dicoding.jetpackpro1.util.MovieObject
import com.sondari.dicoding.jetpackpro1.util.TvShowObject
import org.junit.Test
import org.junit.Rule

class MainActivityTest {
    private val tv = TvShowObject.generateDummyTvShow()
    private val movie = MovieObject.generateDummyMovie()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun onCreate() {
    }

    @Test
    fun loadMovie() {
        Espresso.onView(withId(R.id.rv_movie)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.rv_movie)).perform(
                RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                        movie.size
                )
        )
    }

    @Test
    fun loadDetailActivityMovie() {
        Espresso.onView(withId(R.id.rv_movie)).perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                        0,
                        ViewActions.click()
                )
        )
        Espresso.onView(withId(R.id.poster)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.detailtittle)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.detailtittle)).check(ViewAssertions.matches(withText(movie[0].tittle)))
        Espresso.onView(withId(R.id.dateline)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.dateline)).check(ViewAssertions.matches(withText(movie[0].dateline)))
        Espresso.onView(withId(R.id.score)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.score)).check(ViewAssertions.matches(withText(movie[0].score)))
        Espresso.onView(withId(R.id.status)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.status)).check(ViewAssertions.matches(withText(movie[0].status)))
        Espresso.onView(withId(R.id.desc)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.desc)).check(ViewAssertions.matches(withText(movie[0].description)))
    }

    @Test
    fun loadTvShow() {
        Espresso.onView(withText(R.string.tv_show)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rv_tv_show)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.rv_tv_show)).perform(
                RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                        tv.size
                )
        )
    }

    @Test
    fun loadDetailActivityTvShow() {
        Espresso.onView(withText(R.string.tv_show)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rv_tv_show)).perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                        0,
                        ViewActions.click()
                )
        )
        Espresso.onView(withId(R.id.poster)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.detailtittle)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.detailtittle)).check(ViewAssertions.matches(withText(tv[0].tittle)))
        Espresso.onView(withId(R.id.dateline)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.dateline)).check(ViewAssertions.matches(withText(tv[0].dateline)))
        Espresso.onView(withId(R.id.score)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.score)).check(ViewAssertions.matches(withText(tv[0].score)))
        Espresso.onView(withId(R.id.status)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.status)).check(ViewAssertions.matches(withText(tv[0].status)))
        Espresso.onView(withId(R.id.desc)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.desc)).check(ViewAssertions.matches(withText(tv[0].description)))

    }
}