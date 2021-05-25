package com.sondari.dicoding.jetpackpro1.ui.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sondari.dicoding.jetpackpro1.R
import com.sondari.dicoding.jetpackpro1.data.CatalogueData
import com.sondari.dicoding.jetpackpro1.databinding.ActivityCatalogueDetailBinding

class CatalogueDetail : AppCompatActivity(), View.OnClickListener {

    companion object{
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_USER = "extra_data"
        const val EXTRA_MOVIE = "movie"
        const val EXTRA_TV = "tv"
        const val EXTRA_CHECK = "extras"
    }

    private lateinit var bindingActivityCatalogueDetailBinding: ActivityCatalogueDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingActivityCatalogueDetailBinding = ActivityCatalogueDetailBinding.inflate(
            layoutInflater
        )
        setContentView(bindingActivityCatalogueDetailBinding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[ViewModelCatalogue::class.java]

        val id = intent.getIntExtra(EXTRA_DATA,0)
        viewModel.setSelectedCatalogue(id)

        val extras = intent.getStringExtra(EXTRA_CHECK)
        val catalogue : CatalogueData

        viewModel.setSelectedCatalogue(id)

        if(extras==EXTRA_MOVIE){
            catalogue = viewModel.getMovie()
        }else{
            catalogue = viewModel.getTvShow()
        }

        bindingActivityCatalogueDetailBinding.detailtittle.text = catalogue.tittle
        bindingActivityCatalogueDetailBinding.dateline.text = catalogue.dateline
        bindingActivityCatalogueDetailBinding.status.text = catalogue.status
        bindingActivityCatalogueDetailBinding.score.text = catalogue.score
        bindingActivityCatalogueDetailBinding.desc.text = catalogue.description

        bindingActivityCatalogueDetailBinding.apply { Glide.with(this@CatalogueDetail)
                .load(catalogue.imagePoster)
                .apply(RequestOptions().override(250,350))
                .into(poster) }

        bindingActivityCatalogueDetailBinding.back.setOnClickListener(this)
        bindingActivityCatalogueDetailBinding.share.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {

        val shareIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "This is my link of the movie to send.")
            type = "text/plain"
        }

        when (p0?.id) {
            R.id.back -> {
                finish()
            }
            R.id.share -> {
                startActivity(Intent.createChooser(shareIntent, null))
            }
        }
    }
}