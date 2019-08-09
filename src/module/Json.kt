package ch.keepcalm.ktor.module

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing

class Customer(val id: Int, val name: String, val email: String)

fun Application.json(){

    install(ContentNegotiation){
        gson {
            setPrettyPrinting()
            serializeNulls()
        }
    }

    routing {
        // http :8080/customer
        get("/customer"){
            val model = Customer(id = 1, name = "John Doe", email = "john@doe.ch")
            call.respond(model)
        }
    }
}