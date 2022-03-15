package id.hikmah.binar.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toSatu()
        toDua()
    }

    fun toSatu(){
        val buttonSatu = findViewById<Button>(R.id.btn_satu)
        buttonSatu.setOnClickListener {
            val intent = Intent(this,Satu::class.java)
            startActivity(intent)
        }
    }

    fun toDua(){
        val buttonSatu = findViewById<Button>(R.id.btn_satu)
        buttonSatu.setOnClickListener {
            val intent = Intent(this,Satu::class.java)
            startActivity(intent)
        }
    }
}