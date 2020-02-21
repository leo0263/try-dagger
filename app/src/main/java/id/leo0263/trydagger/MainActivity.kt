package id.leo0263.trydagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.leo0263.trydagger.classes.Car

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car1 = Car()
        car1.start()

        val car2 = Car()
        car2.start()
    }
}
