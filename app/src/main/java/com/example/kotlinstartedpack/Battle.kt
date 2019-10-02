package com.example.kotlinstartedpack

import kotlin.random.Random

class Battle(): BattleInterface{

    var buttleCount: Int = 0;
    var defeatCount: Int = 0;
    var hitCount: Int = 0;
    val battleCry: String? = "Avengers assemble";


    override fun fight(hero: Characters, thanos: Thanos) {
        while(hero.health>0 && thanos.health>0) {
            hero.health -= Random.nextInt(1, 30) * thanos.experience();
            print(battleCry)
            thanos.health -= Random.nextInt(1, 30) * hero.strenght;
            hitCount++
        }
        if (hero.health<=0){
            dieHero(hero)
            defeatCount++
        }else dieThanos(thanos)
        buttleCount++
    }


    override fun dieHero(hero: Characters) {
        hero.isAlive = false
    }

    override fun dieThanos(thanos: Thanos) {
      thanos.isAlive = false
    }
}