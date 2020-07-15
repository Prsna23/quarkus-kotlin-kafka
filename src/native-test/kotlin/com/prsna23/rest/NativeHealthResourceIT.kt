package com.prsna23.rest

import io.quarkus.test.junit.NativeImageTest
import prsna23.rest.HealthResourceTest

@NativeImageTest
class NativeHealthResourceIT : HealthResourceTest()