package com.example.mad_lab_02

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Booking_Group_Activity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_booking_group)

        bottomNavigationView = findViewById(R.id.navigationBar)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> {
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_bookings -> {
                    val intent = Intent(this, Booking_Individual_Activity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_explore -> {
                    val intent = Intent(this, ExploreActivity::class.java)
                    startActivity(intent)
                    true
                }

                else -> false


            }
        }


        //intent to naviagate to booking activity
        //val bookButton = findViewById<LinearLayout>(R.id.bookingsNav)
        //bookButton.setOnClickListener {
         //   val intent = Intent(this, Booking_Individual_Activity::class.java)
         //   startActivity(intent)
        //}
    }
}