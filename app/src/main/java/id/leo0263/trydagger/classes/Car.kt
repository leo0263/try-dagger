package id.leo0263.trydagger.classes

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(
    private val engine: Engine,
    private val wheels: Wheels
) {
    private val TAG = "[L] Car......."

    init {
        Log.d(TAG, "init   [${this.hashCode()}]")
    }

    fun start() {
        engine.check()
        wheels.check()
        Log.d(TAG, "start! [${this.hashCode()}]")
    }
}
