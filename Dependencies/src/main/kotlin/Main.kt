package org.example
import kotlinx.coroutines.*
import org.kohsuke.randname.RandomNameGenerator

fun main() {
    val randomNameGen = RandomNameGenerator()

    val name = randomNameGen.next()
    println(name)
}