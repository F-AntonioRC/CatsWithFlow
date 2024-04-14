package com.example.cats.domain.repositories

import com.example.cats.domain.models.CatFactStates
import kotlinx.coroutines.flow.Flow

interface CatFactRepository {
    suspend fun getCatRandomFact(): Flow<CatFactStates>
}