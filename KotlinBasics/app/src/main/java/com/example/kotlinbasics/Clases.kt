package com.example.kotlinbasics

import java.lang.IllegalArgumentException

fun main() {
    //Creating instances of classes
    var denis = Person("Denis", "Panjuta", 31)
    denis.hobby = "skateboard"
    denis.age = 32
    println("Denis is ${denis.age} years old")
    denis.stateHobby()
    var john = Person()
    john.hobby = "play video games"
    john.stateHobby()
    // var johnPeterseon = Person(lastName = "Peterson")

    var myCar = Car()
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 240
    println("Maxspeed is ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
}

class Person(firstname: String = "John", lastName: String = "Doe") {
    // Member Variables - Propetries
    var age : Int? = null
    var hobby : String = "watch Netflix"
    var firstname : String? = null

    //Initialier Block
    init {
        this.firstname = firstname
        println("Initialized a new Person object with" +
                "firstName = $firstname and lastName = $lastName")
    }

    // Member secondary constructor
    constructor(firstname: String, lastName: String, age: Int): this(firstname, lastName) {
        this.age = age
        println("Initialized a new Person object with" +
                "firstName = $firstname and lastName = $lastName and age $age")
    }

    // Member funciotns - Methods
    fun stateHobby(){
        println("$firstname\'s hobby is $hobby")
    }
}

class Car() {
    lateinit var owner : String

    val myBrand: String = "BMW"
        // Custom getter
        get() {
            return field.toLowerCase()
        }

    var maxSpeed: Int = 250
        get() = field
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Maxspeed cannot be less than 0")
        }

    var myModel : String = "Frank"
        private set

    init {
        this.myModel = "M3"
        this.owner = "Frank"
    }
}