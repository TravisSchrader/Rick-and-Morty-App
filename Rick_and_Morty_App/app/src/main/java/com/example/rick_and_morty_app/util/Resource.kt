package com.example.rick_and_morty_app.util

// this class is a wrapper class for the response from the API
sealed class Resource<T>(val data: T?, val message: String?) {
    class Success<T>(data: T?) : Resource<T>(data, null)
    class Error<T>(message: String?) : Resource<T>(null, message)
}