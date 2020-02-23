package id.leo0263.trydagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.leo0263.trydagger.classes.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gearbox = Gearbox()
        val combustion = Combustion()
        val engine = Engine(combustion = combustion, gearbox = gearbox)
        val wheels = Wheels()

        val car1 = Car(engine = engine, wheels = wheels)
        car1.start()

        val car2 = Car(engine = engine, wheels = wheels)
        car2.start()
    }
}
