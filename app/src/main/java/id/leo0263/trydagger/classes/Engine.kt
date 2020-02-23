package id.leo0263.trydagger.classes

import android.util.Log

class Engine {
    private val TAG = "[L] Engine...."

    init {
        Log.d(TAG, "init   [${this.hashCode()}]")
    }

    private val gearbox = Gearbox()
    private val combustion = Combustion()

    fun check() {
        gearbox.check()
        combustion.check()
        Log.d(TAG, "check! [${this.hashCode()}]")
    }
}
