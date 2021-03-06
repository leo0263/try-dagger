package id.leo0263.trydagger.classes

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(
    private val gearbox: Gearbox,
    private val combustion: Combustion
) {
    private val TAG = "[L] Engine...."

    init {
        Log.d(TAG, "init   [${this.hashCode()}]")
    }

    fun check() {
        gearbox.check()
        combustion.check()
        Log.d(TAG, "check! [${this.hashCode()}]")
    }
}
