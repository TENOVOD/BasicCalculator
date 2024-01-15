package com.example.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.basiccalculator.databinding.ActivityMainBinding
import com.ezylang.evalex.Expression
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) = with(binding) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = root
        setContentView(view)


        val resultTextView = findViewById<TextView>(R.id.result_view)

        val numberStringBuilder = StringBuilder()

        zeroButton.setOnClickListener {
            numberStringBuilder.append(0)
            resultTextView.text = numberStringBuilder
        }


        oneButton.setOnClickListener {
            numberStringBuilder.append(1)
            resultTextView.text = numberStringBuilder
        }

        twoButton.setOnClickListener {
            numberStringBuilder.append(2)
            resultTextView.text = numberStringBuilder
        }

        threeButton.setOnClickListener {
            numberStringBuilder.append(3)
            resultTextView.text = numberStringBuilder
        }

        fourButton.setOnClickListener {
            numberStringBuilder.append(4)
            resultTextView.text = numberStringBuilder
        }

        fiveButton.setOnClickListener {
            numberStringBuilder.append(5)
            resultTextView.text = numberStringBuilder
        }

        sixButton.setOnClickListener {
            numberStringBuilder.append(6)
            resultTextView.text = numberStringBuilder
        }

        sevenButton.setOnClickListener {
            numberStringBuilder.append(7)
            resultTextView.text = numberStringBuilder
        }

        eightButton.setOnClickListener {
            numberStringBuilder.append(8)
            resultTextView.text = numberStringBuilder
        }

        nineButton.setOnClickListener {
            numberStringBuilder.append(9)
            resultTextView.text = numberStringBuilder
        }


        plusButton.setOnClickListener {
            numberStringBuilder.append("+")
            resultTextView.text = numberStringBuilder
        }

        minusButton.setOnClickListener {
            numberStringBuilder.append("-")
            resultTextView.text = numberStringBuilder
        }

        multiplyButton.setOnClickListener {
            numberStringBuilder.append("*")
            resultTextView.text = numberStringBuilder
        }

        pointButton.setOnClickListener {
            numberStringBuilder.append(".")
            resultTextView.text = numberStringBuilder
        }

        divisionButton.setOnClickListener {
            numberStringBuilder.append("/")
            resultTextView.text = numberStringBuilder
        }
        leftBracketButton.setOnClickListener {
            numberStringBuilder.append("(")
            resultTextView.text = numberStringBuilder
        }
        rightBracketButton.setOnClickListener {
            numberStringBuilder.append(")")
            resultTextView.text = numberStringBuilder
        }

        equalButton.setOnClickListener {
            try {
                val expression = Expression(numberStringBuilder.toString())
                resultTextView.text = expression.evaluate().value.toString()

                numberStringBuilder.clear()
                numberStringBuilder.append(expression.evaluate().value.toString())
            } catch (t: Throwable) {
                Toast.makeText(this@MainActivity, "Exception:$t", Toast.LENGTH_LONG).show()
            }

        }

        clearButton.setOnClickListener {
            numberStringBuilder.clear()
            resultTextView.text = numberStringBuilder
        }
        resetButton.setOnClickListener {
            numberStringBuilder.deleteCharAt(numberStringBuilder.lastIndex)
            resultTextView.text = numberStringBuilder
        }


    }
}