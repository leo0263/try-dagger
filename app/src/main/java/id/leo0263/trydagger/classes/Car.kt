package id.leo0263.trydagger.classes

import android.util.Log


class Car {
    private val TAG = "Car"

    init {
        Log.d(TAG, "init")
    }

    private val engine = Engine()
    private val wheels = Wheels()

    fun start() {
        Log.d(TAG, "start!")
    }
}
