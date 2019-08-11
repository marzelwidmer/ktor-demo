package ch.keepcalm.ktor.module

import com.fasterxml.jackson.databind.SerializationFeature
import freemarker.cache.ClassTemplateLoader
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.freemarker.FreeMarker
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.jackson.jackson
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing
import java.text.DateFormat

fun Application.foobar() {

    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
    }

    install(ContentNegotiation) {
        jackson {
            // Configure Jackson's ObjectMapper here
            enable(SerializationFeature.INDENT_OUTPUT) // Pretty Prints the JSON
            dateFormat = DateFormat.getDateInstance()
            disableDefaultTyping()
        }
    }

    routing {
        get("/freemarker") {


            val users = listOf<User>(User("John Doe", "john@doe.com"),
                User("Jane Doe", "jane@doe.com"))

            call.respond(FreeMarkerContent("index.ftl", mapOf("users" to users), "e"))
        }
    }
}

class User(val name: String, val email: String)

