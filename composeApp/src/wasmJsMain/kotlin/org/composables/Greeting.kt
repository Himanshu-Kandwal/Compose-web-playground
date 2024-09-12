package org.composables

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, first app on ${platform.name}!"
    }
}