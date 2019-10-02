package com.example.kotlinstartedpack

interface BattleInterface {
    fun fight(hero: Characters, thanos: Thanos)
    fun dieHero(hero: Characters)
    fun dieThanos(thanos: Thanos)
}