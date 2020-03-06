package id.leo0263.trydagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.leo0263.trydagger.classes.Car
import id.leo0263.trydagger.di.CarComponent
import id.leo0263.trydagger.di.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    lateinit var car1: Car
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.create()
        car1 = component.getCar()
        car2 = component.getCar()

        car1.start()
        car2.start()
    }
}
