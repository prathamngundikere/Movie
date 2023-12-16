package com.prathamngundikere.movie.movieList.data.local.movie

import androidx.room.Database
import androidx.room.RoomDatabase
import com.prathamngundikere.movie.movieList.data.local.movie.MovieDao
import com.prathamngundikere.movie.movieList.data.local.movie.MovieEntity

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao
}