package com.example.prak12pbmjoedie.api

import com.example.prak12pbmjoedie.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>

}