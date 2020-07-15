package com.prsna23.kafka

import io.smallrye.reactive.messaging.annotations.Broadcast
import org.eclipse.microprofile.reactive.messaging.Incoming
import org.eclipse.microprofile.reactive.messaging.Outgoing
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class PriceConverter {

    private val CONVERSION_RATE = 75.31

    @Incoming("prices")
    @Outgoing("my-data-stream")
    @Broadcast
    fun process(priceInUsd: Int) = priceInUsd * CONVERSION_RATE
}