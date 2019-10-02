package com.example.kotlinstartedpack

import kotlin.random.Random

class RandomDestruction: RandomInterface {
    var destiny: Int = 0;
    var dustCount: Int = 0;
    var safeCount: Int = 0;

    fun getDestiny(): String{
        destiny = Random.nextInt(0,2)
        return when (destiny){
            0 -> {
                neotvratimost()
                dustCount++
                "Я сама неотвратимость"
            }
            1 -> {
                vratimost(giveHeroToSave())
                safeCount++
                "Я так просто Железный человек"
            }
            else -> "Перчатка в воздухе"
        }
    }



    override fun neotvratimost() {
        Characters.values()[Random.nextInt(0,9)].isAlive = false
     }

    fun giveHeroToSave(): Characters{
       return Characters.BLACKWIDOW
    }
    override fun vratimost(hero: Characters) {
        hero.isAlive = true
    }



}