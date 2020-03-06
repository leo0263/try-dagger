package id.leo0263.trydagger.classes

import android.util.Log
import javax.inject.Inject

class Combustion @Inject constructor() {
    private val TAG = "[L] Combustion"

    init {
        Log.d(TAG, "init   [${this.hashCode()}]")
    }

    fun check() {
        Log.d(TAG, "check! [${this.hashCode()}]")
    }
}
