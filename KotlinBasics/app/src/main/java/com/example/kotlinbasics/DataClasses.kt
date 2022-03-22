package com.example.kotlinbasics

data class User(val id: Long, var name: String)

fun main() {

    val user = User(1, "Denis")

    val name1 = user.name
    println(name1)
    user.name = "Michael"
    val user1 = User(1, "Michael")

    println(user == user1)

    println("User Details: $user")

    val updateUser = user.copy(name="Denis Panjuta")
    println(user)
    println(updateUser)

    println(updateUser.component1()) // print 1
    println(updateUser.component2()) // prints Denis Pantuja

    val (id, name) = updateUser
    println("id=$id, name=$name")
}