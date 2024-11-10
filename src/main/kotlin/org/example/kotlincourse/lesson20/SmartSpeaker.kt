package org.example.kotlincourse.lesson20

import SoundEmitting
import java.io.InputStream

class SmartSpeaker : PowerableDevice(), SoundEmitting {
    override fun setVolume(volume: Int) {
        TODO("Not yet implemented")
    }

    override fun mute() {
        TODO("Not yet implemented")
    }

    override fun playSound(stream: InputStream) {
        TODO("Not yet implemented")
    }

}