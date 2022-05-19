package com.rahmanaulia.learndagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.rahmanaulia.learndagger2.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val component = DaggerCarComponent.create()
        component.inject(this)
        car.drive()

        val user = User()
        user.name = "Aulia Rahman"
        user.age = 10
        user.address = "Cimahi"

        val gson = GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
        val json = Gson().toJson(user)
        Log.d(TAG, "onCreate: $json")
    }

    companion object{
        const val TAG = "coba"
    }
}