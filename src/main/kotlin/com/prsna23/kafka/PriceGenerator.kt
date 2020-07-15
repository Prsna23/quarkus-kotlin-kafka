package com.prsna23.kafka

import io.reactivex.Flowable
import org.eclipse.microprofile.reactive.messaging.Outgoing
import java.util.*
import java.util.concurrent.TimeUnit
import javax.enterprise.context.ApplicationScoped


@ApplicationScoped
class PriceGenerator {
    private val random: Random = Random()

    @Outgoing("generated-price")
    fun generate(): Flowable<Int>? {
        return Flowable.interval(5, TimeUnit.SECONDS)
                .map { tick: Long? -> random.nextInt(100) }
    }

}