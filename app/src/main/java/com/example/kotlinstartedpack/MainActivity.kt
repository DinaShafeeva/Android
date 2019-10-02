package com.example.kotlinstartedpack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val battle = Battle()
        val thanos = Thanos()
        val randomDestruction = RandomDestruction()


            battle.fight(Characters.BLACKWIDOW, thanos)
        if (thanos.isAlive) {
            loge(randomDestruction.getDestiny())
            battle.fight(Characters.IRONMAN, thanos)
            if (thanos.isAlive) {
                loge(randomDestruction.getDestiny())
            battle.fight(Characters.CAPTAINMARVEL, thanos)
        }
        } else loge("AVENGERS WON")
    }


}
inline fun loge(text: String){
    Log.i("TAG", text)
}
