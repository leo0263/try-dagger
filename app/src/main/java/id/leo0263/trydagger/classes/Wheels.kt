package id.leo0263.trydagger.classes

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {
    private val TAG = "[L] Wheels...."

    init {
        Log.d(TAG, "init   [${this.hashCode()}]")
    }

    fun check() {
        Log.d(TAG, "check! [${this.hashCode()}]")
    }
}
