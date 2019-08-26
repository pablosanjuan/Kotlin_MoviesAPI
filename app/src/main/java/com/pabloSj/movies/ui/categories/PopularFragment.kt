package com.pabloSj.movies.ui.categories

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pabloSj.movies.R
import com.pabloSj.movies.data.api.ApiClient
import com.pabloSj.movies.data.api.MovieApiResponse
import com.pabloSj.movies.data.api.service.Service
import com.pabloSj.movies.data.model.Movie
import com.pabloSj.movies.ui.adapter.MoviesAdapter
import com.pabloSj.movies.util.API_KEY
import kotlinx.android.synthetic.main.fragment_popular.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PopularFragment : Fragment() {
    private lateinit var mContext: Activity
    private lateinit var adapter: MoviesAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mContext = Activity()
        return inflater.inflate(R.layout.fragment_popular, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listMovies = ArrayList<Movie>()
        adapter = MoviesAdapter(mContext,listMovies)
        popular_reciclerView.layoutManager = GridLayoutManager(mContext,2) as RecyclerView.LayoutManager?
        //reciclerView.adapter = adapter

        val client = ApiClient()
        val service =  client.provideHttpClient().create(Service::class.java)
        val call:Call<MovieApiResponse> = service.getMoviesPopular(API_KEY)
        call.enqueue(object:Callback<MovieApiResponse>{
            override fun onResponse(call: Call<MovieApiResponse>, response: Response<MovieApiResponse>) {
                val movies = response.body()!!.results
                popular_reciclerView.adapter = MoviesAdapter(mContext, movies)
                popular_reciclerView.smoothScrollToPosition(0)
            }
            override fun onFailure(call: Call<MovieApiResponse>, t: Throwable) {
                Log.d("error", t.message)
            }
        })
    }
}