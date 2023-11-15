package com.example.userslist
import com.example.userslist.data.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("https://jsonplaceholder.typicode.com/users")
    fun fetchUsers(): Call<List<User>>
}