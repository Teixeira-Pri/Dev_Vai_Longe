package com.example.devvailonge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.devvailonge.models.Video
import kotlinx.android.synthetic.main.item_video.view.*

class VideoAdapter(private val onItemClicked : (Video) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items : List<Video> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return VideoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
        )
    }

    override fun getItemCount(): Int {
       return items.size
    }

    fun setDataSet(videos: List<Video>){
        this.items = videos
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is VideoViewHolder -> {
                holder.bind(items[position], onItemClicked)
            }
        }
    }

    class VideoViewHolder constructor(
        itemView : View
    ): RecyclerView.ViewHolder(itemView){

        private val videoTitle = itemView.title
        private val videoAuthor = itemView.author
        private val videoThumbnail = itemView.thumbnail

        fun bind(video : Video, onItemClicked : (Video) -> Unit){

            videoTitle.text = video.title
            videoAuthor.text = video.author

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(video.thumbnailUrl)
                .into(videoThumbnail)

            itemView.setOnClickListener {
                onItemClicked(video)
            }

        }

    }


}