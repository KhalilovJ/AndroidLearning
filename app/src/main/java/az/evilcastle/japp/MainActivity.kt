package az.evilcastle.japp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num = 0

        val btnClickMe = findViewById<Button>(R.id.btn1)
        btnClickMe.setOnClickListener{
            btnClickMe.text = "Clicked"
        }
    }
}