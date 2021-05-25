package com.sondari.dicoding.jetpackpro1.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CatalogueData (

    var id : Int,
    var imagePoster : Int,
    var tittle : String,
    var description : String,
    var dateline : String,
    var score : String,
    var status : String

    ): Parcelable