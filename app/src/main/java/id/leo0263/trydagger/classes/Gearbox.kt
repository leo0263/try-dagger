package id.leo0263.trydagger.classes

import android.util.Log

class Gearbox {
    private val TAG = "[L] Gearbox..."

    init {
        Log.d(TAG, "init   [${this.hashCode()}]")
    }

    fun check() {
        Log.d(TAG, "check! [${this.hashCode()}]")
    }
}
