package id.leo0263.trydagger.di

import dagger.Component
import id.leo0263.trydagger.classes.Car

@Component
interface CarComponent {

    fun getCar(): Car
}
