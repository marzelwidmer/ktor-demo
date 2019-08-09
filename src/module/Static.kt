package ch.keepcalm.ktor.module

import io.ktor.application.Application
import io.ktor.http.content.resources
import io.ktor.http.content.static
import io.ktor.routing.routing

fun Application.static(testing: Boolean = false) {
    routing {
        // Static feature. Try to access `/static/ktor_logo.svg`
        // http :8080/static/ktor_logo.svg
        static("/static") {
            resources("static")
        }
    }
}

