package com.example.kotlinstartedpack

data class Thanos(val strenght: Int = 10,
                  var health: Int = 500,
                  val agility: Int = 100,
                  val possibilityOfNeotvratimost: Int = 5,
                  var isAlive: Boolean = true) {

    val battle = Battle()

    fun waitForSmth(): Int {
        if ((battle.buttleCount % 4)==0){
           return strenght/2
        }else return strenght
    }

    fun experience(): Int {
        return waitForSmth() + battle.defeatCount
    }
}