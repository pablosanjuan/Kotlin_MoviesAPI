package com.pabloSj.movies.ui.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pabloSj.movies.R
import com.pabloSj.movies.data.model.Movie

class TopAdapter(mContext: Activity,listMovies: List<Movie>): RecyclerView.Adapter<TopAdapter.ViewHolder>() {
    var mCcontext= mContext
    var movie=listMovies

    fun MoviesAdapter(context: Activity, Movies: List<Movie>) {
        this.mCcontext = context
        this.movie = Movies
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = movie[position]
        holder.bind(item, mCcontext)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.movie_item, parent, false))
    }

    override fun getItemCount(): Int {
        return movie.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val movieImage = view.findViewById(R.id.movie_image) as ImageView
        private val movieTittle = view.findViewById(R.id.movie_tittle) as TextView
        private val movieVote = view.findViewById(R.id.movie_vote_average) as TextView

        fun bind(Movies: Movie, context: Activity) {
            movieImage.loadUrl(Movies.poster_path)
            movieTittle.text = Movies.title
            movieVote.text = Movies.vote_average
            //itemView.setOnClickListener { Toast.makeText(context, Movies.title, Toast.LENGTH_SHORT).show() }
        }

        fun ImageView.loadUrl(url: String) {
            Glide.with(context).load("https://image.tmdb.org/t/p/w500$url").into(this)
        }
    }
}