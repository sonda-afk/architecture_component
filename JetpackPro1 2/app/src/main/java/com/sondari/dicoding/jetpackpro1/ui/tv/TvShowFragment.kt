package com.sondari.dicoding.jetpackpro1.ui.tv

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.sondari.dicoding.jetpackpro1.data.CatalogueData
import com.sondari.dicoding.jetpackpro1.databinding.FragmentTvShowBinding
import com.sondari.dicoding.jetpackpro1.ui.detail.CatalogueDetail
import com.sondari.dicoding.jetpackpro1.util.TvShowObject

class TvShowFragment : Fragment() {

    private lateinit var fragmentTvShowBinding: FragmentTvShowBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        fragmentTvShowBinding = FragmentTvShowBinding.inflate(layoutInflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val tv = TvShowObject.generateDummyTvShow()
            val tvAdapter = TvShowAdapter()
            tvAdapter.setTvShow(tv)

            with(fragmentTvShowBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvAdapter

                tvAdapter.setOnItemsClickCallback(object : TvShowAdapter.OnItemClickCallback {

                    override fun OnItemClicked(tv: CatalogueData) {
                        val intent = Intent(context, CatalogueDetail::class.java)
                        intent.putExtra(CatalogueDetail.EXTRA_USER, tv.id)
                        intent.putExtra(CatalogueDetail.EXTRA_CHECK,CatalogueDetail.EXTRA_TV)
                        startActivity(intent)
                    }
                })
            }

        }
    }
}