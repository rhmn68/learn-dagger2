package com.rahmanaulia.learndagger2

import dagger.Component

@Component
interface CarComponent {
//    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}