package com.example.rick_and_morty_app.main

import com.example.rick_and_morty_app.data.RickMortyApi
import javax.inject.Inject

class DefaultRickMortyApi @Inject constructor(
    private val api: RickMortyApi
) : RickMortyApiRepo{



    // implement api functions here
}