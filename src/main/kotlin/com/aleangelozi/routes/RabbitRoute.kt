package com.aleangelozi.routes

import com.aleangelozi.data.model.Rabbit
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

//private const val BASE_URL = "http://10.0.2.2:8080"
private const val BASE_URL = "http://192.168.15.167:8080"
private val rabbits = listOf(
    Rabbit("Josh", "Cute", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Sophy", "Kind", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("Jenny", "Sah", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Rick", "Smart", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Morty", "Friendly", "$BASE_URL/rabbits/rabbit5.jpg"),
)

fun Route.randomRabbit() {
    get("/randomrabbit") {

        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
        //Example of parameter def
    //call.parameters["rabbitId"]
    }
}