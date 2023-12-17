package com.prathamngundikere.movie.details.presentation

import com.prathamngundikere.movie.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
