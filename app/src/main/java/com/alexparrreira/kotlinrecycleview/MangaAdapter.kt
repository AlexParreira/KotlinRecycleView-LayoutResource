package com.alexparrreira.kotlinrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alexparrreira.kotlinrecycleview.model.Manga
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.res_item_manga.view.*

class MangaAdapter (
    private val onItemCliked : (Manga)-> Unit
        ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<Manga> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MangaViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_manga,parent,false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is MangaViewHolder ->{
                holder.bind(items[position], onItemCliked)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataset(mangas : List<Manga>){

        this.items = mangas
    }

    class MangaViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        private val mangaTitle = itemView.title
        private val mangaAuthor = itemView.author
        private val mangaThumbnail = itemView.thumbnail

        fun bind(manga: Manga, onItemCliked: (Manga) -> Unit){
            mangaTitle.text = manga.title
            mangaAuthor.text = manga.author

            var requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(manga.thumbnailUrl)
                .into(mangaThumbnail)

            itemView.setOnClickListener({
                onItemCliked(manga)
            })
        }
    }

}