package com.prsna23.kafka

import org.eclipse.microprofile.reactive.messaging.Channel
import org.jboss.resteasy.annotations.SseElementType
import org.reactivestreams.Publisher
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType


@Path("/prices")
class PriceResource {
    @Inject
    @Channel("my-data-stream")
    var prices: Publisher<Double>? = null

    @GET
    @Path("/stream")
    @Produces(MediaType.SERVER_SENT_EVENTS)
    @SseElementType("text/plain")
    fun stream() = prices
}