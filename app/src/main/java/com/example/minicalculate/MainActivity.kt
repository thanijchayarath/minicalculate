package com.example.minicalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n = Toast.makeText(applicationContext,"Please input Number1!!!", Toast.LENGTH_LONG)
        val n2 = Toast.makeText(applicationContext,"Please input Number2!!!",Toast.LENGTH_LONG)
        val n3 = Toast.makeText(applicationContext,"Please input Number1 and Number2!!!",Toast.LENGTH_LONG)
        val n4 = Toast.makeText(applicationContext,"Please change Number2 to be a number!!!", Toast.LENGTH_LONG)
        var ans = 0

        plus.setOnClickListener() {
            if (enum1.text.toDouble() != "" && enum2.text.toDouble() != ""){
                var functions = findViewById<TextView>(R.id.functions)
                functions.setText("+")
                ans = enum1 + enum2
                var answer = findViewById<TextView>(R.id.answer)
                answer.setText("$ans")
            } else {
                if (enum1.text.toDouble() == ""){
                    n.show()
                } else {
                    if (enum2.text.toDouble() == ""){
                        n2.show()
                    } else {
                        n3.show()
                    }
                }
            }
        }

        minus.setOnClickListener() {
            if (enum1.text.toDouble() != "" && enum2.text.toDouble() != ""){
                var functions = findViewById<TextView>(R.id.functions)
                functions.setText("-")
                ans = enum1 - enum2
                var answer = findViewById<TextView>(R.id.answer)
                answer.setText("$ans")
            } else {
                if (enum1.text.toDouble() == ""){
                    n.show()
                } else {
                    if (enum2.text.toDouble() == ""){
                        n2.show()
                    } else {
                        n3.show()
                    }
                }
            }
        }

        multiply.setOnClickListener() {
            if (enum1.text.toDouble() != "" && enum2.text.toDouble() != ""){
                var functions = findViewById<TextView>(R.id.functions)
                functions.setText("*")
                ans = enum1 * enum2
                var answer = findViewById<TextView>(R.id.answer)
                answer.setText("$ans")
            } else {
                if (enum1.text.toDouble() == ""){
                    n.show()
                } else {
                    if (enum2.text.toDouble() == ""){
                        n2.show()
                    } else {
                        n3.show()
                    }
                }
            }
        }

        divider.setOnClickListener() {
            if (enum1.text.toDouble() != "" && enum2.text.toDouble() != ""){
                var functions = findViewById<TextView>(R.id.functions)
                functions.setText("/")
                ans = enum1 / enum2
                var answer = findViewById<TextView>(R.id.answer)
                answer.setText("$ans")
            } else {
                if (enum1.text.toDouble() == ""){
                    n.show()
                } else {
                    if (enum2.text.toDouble() == ""){
                        n2.show()
                    } else {
                        if (enum2.text.toDouble() == "0"){
                            n4.show()
                        } else {
                            n3.show()
                        }
                    }
                }
            }
        }

        modulo.setOnClickListener() {
            if (enum1.text.toDouble() != "" && enum2.text.toDouble() != ""){
                var functions = findViewById<TextView>(R.id.functions)
                functions.setText("%")
                ans = enum1 % enum2
                var answer = findViewById<TextView>(R.id.answer)
                answer.setText("$ans")
            } else {
                if (enum1.text.toDouble() == ""){
                    n.show()
                } else {
                    if (enum2.text.toDouble() == ""){
                        n2.show()
                    } else {
                        n3.show()
                    }
                }
            }
        }

        clear.setOnClickListener() {
            enum1.setText(null)
            enum2.setText(null)
            answer.setText(null)
            functions.setText(null)
        }
    }
}