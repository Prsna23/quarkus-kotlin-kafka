package com.prsna23.rest

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class HealthResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/health")
          .then()
             .statusCode(200)
             .body(`is`("hello"))
    }

}