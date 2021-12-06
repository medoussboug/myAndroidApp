package com.example.trendingrespositoriesapp.domain.DTOs

data class MostStaredRepositoryDTO (
    val id: Int,
    val reprositoryName: String,
    val repositoryDescription: String,
    val numberOfStars: Double,
    val userName: String,
    val avatar: String
        ) {
}