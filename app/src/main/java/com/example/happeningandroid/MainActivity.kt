package com.oleg.Happening

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.happeningandroid.Event
import com.example.happeningandroid.FirebaseDatabaseService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eventsTable = FirebaseDatabaseService("events", Event::class.java)
        eventsTable.addDataChangedListener { event, eventType ->
            println(event.toString())
        }
    }
}
