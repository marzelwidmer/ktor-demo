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
                    title { +"Ktor Demo" }
                }
                body {
                    h1 { +"HTML" }
                    ul {
                        for (n in 1..10) {
                            li { +"$n" }
                        }
                    }
                }
            }
        }
    }
}

