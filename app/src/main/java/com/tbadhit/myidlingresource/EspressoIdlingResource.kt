package com.tbadhit.myidlingresource

import androidx.test.espresso.IdlingResource
import androidx.test.espresso.idling.CountingIdlingResource

object EspressoIdlingResource {
    private val RESOURCE: String? = "GLOBAL"

    private val espressoIdlingResource = CountingIdlingResource(RESOURCE)
    fun increment() {
        espressoIdlingResource.increment()
    }

    fun decrement() {
        espressoIdlingResource.decrement()
    }

    fun getEspressoIdlingResource(): IdlingResource {
        return espressoIdlingResource
    }
}