package com.erikriosetiawan

fun main() {
    val name = CommonUtils.anyName
    println(name)
    CommonUtils.displayMessage("like static call")

    SharedRegistry.register("a", "apple")
    SharedRegistry.register("b", "boy")
    SharedRegistry.register("c", "cat")
    SharedRegistry.register("d", "dog")
}