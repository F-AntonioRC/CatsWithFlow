package com.example.cats.domain.usecases

import com.example.cats.domain.models.CatFactStates
import com.example.cats.domain.repositories.CatFactRepository
import kotlinx.coroutines.flow.Flow


class GetCatRandomFactUseCaseImpl(
    private val catFactRepository: CatFactRepository
): GetCatRandomFactUseCase {
    override suspend fun invoke(): Flow<CatFactStates> = catFactRepository.getCatRandomFact()
}