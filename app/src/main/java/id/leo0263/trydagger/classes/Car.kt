package id.leo0263.trydagger.classes

import android.util.Log


class Car {
    private val TAG = "[L] Car......."

    init {
        Log.d(TAG, "init   [${this.hashCode()}]")
    }

    private val engine = Engine()
    private val wheels = Wheels()

    fun start() {
        engine.check()
        wheels.check()
        Log.d(TAG, "start! [${this.hashCode()}]")
    }
}
