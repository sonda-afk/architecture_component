package com.sondari.dicoding.jetpackpro1.ui.tv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sondari.dicoding.jetpackpro1.data.CatalogueData
import com.sondari.dicoding.jetpackpro1.databinding.ItemsTvShowBinding

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>(){

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun OnItemClicked(tv: CatalogueData)

    }

    fun setOnItemsClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    private var listTvShow = ArrayList<CatalogueData>()

    inner class TvShowViewHolder(private val binding: ItemsTvShowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tv: CatalogueData){
            with(binding){
                tvItemTitle.text = tv.tittle
                tvItemDate.text = tv.dateline

                Glide.with(itemView.context)
                    .load(tv.imagePoster)
                    .apply(RequestOptions().override(100,100))
                    .into(imgTvShow)
                itemView.setOnClickListener{
                    onItemClickCallback.OnItemClicked(tv)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsTvShowBinding = ItemsTvShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tv = listTvShow[position]
        holder.bind(tv)
    }

    override fun getItemCount(): Int = listTvShow.size

    fun setTvShow(tv: List<CatalogueData>?) {
        if (tv == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tv)
    }


}