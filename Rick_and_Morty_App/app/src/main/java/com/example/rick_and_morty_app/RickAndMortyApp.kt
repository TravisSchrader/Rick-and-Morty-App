package com.example.rick_and_morty_app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// this is the main application class which is needed to use hilt dagger
@HiltAndroidApp
class RickAndMortyApp: Application()
