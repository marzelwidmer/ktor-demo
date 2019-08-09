package ch.keepcalm.ktor.module

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.html.respondHtml
import io.ktor.routing.get
import io.ktor.routing.routing
import kotlinx.html.*

fun Application.html() {

    routing {
        get("/html-dsl") {
            call.respondHtml {
                head {
                    title { +"Async World" }
                }
                body {
                    h1("title") {
                        +"Title"
                    }
                }
            }
        }
    }
}

