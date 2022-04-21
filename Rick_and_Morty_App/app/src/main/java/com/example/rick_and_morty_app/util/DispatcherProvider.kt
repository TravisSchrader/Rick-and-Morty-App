package com.example.rick_and_morty_app.util

import kotlinx.coroutines.CoroutineDispatcher


// This is a interface which allows implementation to assign different coroutines to each of these values
interface DispatcherProvider {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}