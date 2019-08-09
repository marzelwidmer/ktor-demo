package ch.keepcalm.ktor.module

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing

fun Application.simple(testing: Boolean = false) {

    routing {
        get("/") {
            call.respondText("HELLO WORLD!", contentType = ContentType.Text.Html)
        }
    }

}

