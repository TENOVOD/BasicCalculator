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
    private val numberStringBuilder = StringBuilder()
    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setListeners()

    }

    private fun setListeners() = with(binding){


        zeroButton.setOnClickListener {
            numberStringBuilder.append(0)
            resultView.text = numberStringBuilder
        }


        oneButton.setOnClickListener {
            numberStringBuilder.append(1)
            resultView.text = numberStringBuilder
        }

        twoButton.setOnClickListener {
            numberStringBuilder.append(2)
            resultView.text = numberStringBuilder
        }

        threeButton.setOnClickListener {
            numberStringBuilder.append(3)
            resultView.text = numberStringBuilder
        }

        fourButton.setOnClickListener {
            numberStringBuilder.append(4)
            resultView.text = numberStringBuilder
        }

        fiveButton.setOnClickListener {
            numberStringBuilder.append(5)
            resultView.text = numberStringBuilder
        }

        sixButton.setOnClickListener {
            numberStringBuilder.append(6)
            resultView.text = numberStringBuilder
        }

        sevenButton.setOnClickListener {
            numberStringBuilder.append(7)
            resultView.text = numberStringBuilder
        }

        eightButton.setOnClickListener {
            numberStringBuilder.append(8)
            resultView.text = numberStringBuilder
        }

        nineButton.setOnClickListener {
            numberStringBuilder.append(9)
            resultView.text = numberStringBuilder
        }


        plusButton.setOnClickListener {
            numberStringBuilder.append("+")
            resultView.text = numberStringBuilder
        }

        minusButton.setOnClickListener {
            numberStringBuilder.append("-")
            resultView.text = numberStringBuilder
        }

        multiplyButton.setOnClickListener {
            numberStringBuilder.append("*")
            resultView.text = numberStringBuilder
        }

        pointButton.setOnClickListener {
            numberStringBuilder.append(".")
            resultView.text = numberStringBuilder
        }

        divisionButton.setOnClickListener {
            numberStringBuilder.append("/")
            resultView.text = numberStringBuilder
        }
        leftBracketButton.setOnClickListener {
            numberStringBuilder.append("(")
            resultView.text = numberStringBuilder
        }
        rightBracketButton.setOnClickListener {
            numberStringBuilder.append(")")
            resultView.text = numberStringBuilder
        }

        equalButton.setOnClickListener {
            calculate()

        }

        clearButton.setOnClickListener {
            numberStringBuilder.clear()
            resultView.text = numberStringBuilder
        }
        resetButton.setOnClickListener {
            numberStringBuilder.deleteCharAt(numberStringBuilder.lastIndex)
            resultView.text = numberStringBuilder
        }

    }

    private fun ActivityMainBinding.calculate() {
        try {
            val expression = Expression(numberStringBuilder.toString())
            resultView.text = expression.evaluate().value.toString()

            numberStringBuilder.clear()
            numberStringBuilder.append(expression.evaluate().value.toString())
        } catch (t: Throwable) {
            Toast.makeText(this@MainActivity, "Exception:$t", Toast.LENGTH_LONG).show()
        }
    }
}