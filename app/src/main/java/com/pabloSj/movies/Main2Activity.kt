package com.pabloSj.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
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

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
}
