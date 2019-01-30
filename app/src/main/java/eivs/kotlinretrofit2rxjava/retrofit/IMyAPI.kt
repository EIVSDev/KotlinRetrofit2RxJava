package eivs.kotlinretrofit2rxjava.retrofit

import eivs.kotlinretrofit2rxjava.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface IMyAPI {
    @get:GET("posts")
    val posts:Observable<List<Post>>
}