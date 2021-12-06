package com.example.trendingrespositoriesapp.domain.DTOs

data class TrendingRepositoriesDTO(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int?
)