package com.examples.coding.newsapp.datasource.remote

import com.examples.coding.newsapp.model.news.NewsApiResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface NewsApiService {
    companion object{
        fun getNewsApiService()
                = RetrofitHelper.retrofitInstance.create(NewsApiService::class.java)
    }
    @GET(PATH_TOP_HEADLINES)
    fun getTopHeadlines(@Query(QUERY_PARAM_COUNTRY) country : String, @Header("Authorization") key : String)
    : Observable<NewsApiResponse>

    @GET(PATH_TOP_HEADLINES)
    fun getTopHeadlinesByCategory(@Query(QUERY_PARAM_COUNTRY) country : String, @Query("category") category : String, @Header("Authorization") key : String)
            : Observable<NewsApiResponse>
}