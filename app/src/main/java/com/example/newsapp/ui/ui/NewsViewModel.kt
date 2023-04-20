package com.example.newsapp.ui.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.newsapp.ui.repository.NewsRepository

class NewsViewModel(val newsRepository: Application, newsRepository1: NewsRepository):ViewModel() {
}