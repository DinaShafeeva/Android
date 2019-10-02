package com.example.kotlinstartedpack

enum class Characters(val strenght: Int, var health: Int, val agility: Int, var isAlive: Boolean = true) {
    CAPTAINAMERICA(3,100, 100),
    IRONMAN(4,50, 50),
    BLACKWIDOW(1,50,200),
    THOR(5,180, 50),
    HALK(5,200, 50),
    HAWKEYE(1, 50,180),
    CAPTAINMARVEL(5,200,100),
    ANTMAN(4,50,200),
    SPIDERMAN(3, 100, 200)

}