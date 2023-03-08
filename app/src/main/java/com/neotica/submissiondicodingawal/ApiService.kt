package com.neotica.submissiondicodingawal

import com.neotica.submissiondicodingawal.response.GithubResponseItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {
  //  @Headers("Authorization: token 4c5b087d8f967fdfda3cbc967eca7ae13c33428d")
    @GET("/users")
    fun getUser(): Call<List<GithubResponseItem>>

}