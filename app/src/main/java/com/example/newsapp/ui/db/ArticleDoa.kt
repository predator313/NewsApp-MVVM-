package com.example.newsapp.ui.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.newsapp.ui.models.Article

@Dao
interface ArticleDoa {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article):Long
    @Query("SELECT * FROM articles")
    fun getAllArticles():LiveData<List<Article>>
    //here we not use the suspend func because live data can't work with suspend func
    @Delete
    suspend fun deleteArticle(article: Article)
}
//need to handle this tomorrow we should again see it how to do it
//room db is very important