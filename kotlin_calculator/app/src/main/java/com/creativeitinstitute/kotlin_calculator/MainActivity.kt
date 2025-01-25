package com.creativeitinstitute.kotlin_calculator

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.creativeitinstitute.kotlin_calculator.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
//    lateinit var cosEdit : EditText
    lateinit var binding: ActivityMainBinding





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        cosEdit = findViewById(R.id.cosEdit)
        binding.calculatebtn.setOnClickListener  {
            var cosStr = binding.cosEdit.text.toString()
            var cos = cosStr.toDouble()

            var selectedId = binding.tipOptions.checkedRadioButtonId
            var tipPercent = when (selectedId) {
                R.id.option_twenty_percent -> 0.20
                R.id.option_ten_percent -> 0.10
                else -> 0.05
            }
            var tip = tipPercent * cos
//            var total = tip + cos
            if (binding.roundUpSwitch.isChecked) {
                tip = kotlin.math.ceil(tip)
            }

            val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
            binding.ttTV.text = "total tip is $formattedTip"
        }
    }
}



// new -> imaage insert -> akta imagae nibo then size mize thik korbo -> finish a click bash  for icon

// drawable jonno vector assert jai korbo


