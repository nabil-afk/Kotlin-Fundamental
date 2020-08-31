package main.kotlin

fun main (){
    val user = setUser("Nabil Dzakwan", 16)
    println(user)
}
fun setUser (name:String, age: Int) = "My name is $name, I like Basket and Playing game, and i'm $age years old"
