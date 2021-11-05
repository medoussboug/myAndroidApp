package com.example.trendingrespositoriesapp.domain

data class MostScoredRepositoryDTO (
    val id: Int,
    val reprositoryName: String,
    val repositoryDescription: String,
    val numberOfStars: Double,
    val userName: String,
    val avatar: String
        ) {
}