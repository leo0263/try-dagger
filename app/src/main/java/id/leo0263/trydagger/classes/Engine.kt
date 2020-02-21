package id.leo0263.trydagger.classes

import android.util.Log

class Engine {
    private val TAG = "Engine"

    init {
        Log.d(TAG, "init")
    }

    private val gearbox = Gearbox()
    private val combustion = Combustion()
}
