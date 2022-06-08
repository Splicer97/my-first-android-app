package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    var counter = 0
//    var counter:Byte = 0 // занимает 1 байт
//    var counter:Short = 0 // занимает 2 байта
//    var counter:Int = 0 // занимает 4 байта
//    var counter:Long = 0 // занимает 8 байт

    // Byte для небольших чисел до 128
    // Short для чисел побольше
    // Int это целые числа (обычно используют его)
    // Long для больших чисел
    // Если явно не указывать тип, система сама выберет его в зависимости от числа (по умолчанию Int)

//    var counter:Float = 0.8f // занимает 4 байта
//    var counter:Double = 0.7 // занимает 8 байт
// Float и Double для чисел с плавающей точкой

//    var testChar: Char = 'd'
    // Представляет собой отдельный единичный символ

    // еще есть тип String и Boolean

    // var переменная типа let
    // val переменная типа const


//    var globalTextView : TextView? = null
    // знак ? означает, что переменная может быть пустой
//lateinit var lateGlobalTextView: TextView
// мы обьявили переменную, но указали, что она будет инициализирована позднее
//lateinit var btn : Button

lateinit var bindingClass : ActivityMainBinding
//val a = 0
//    val b = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(bindingClass.root)
    bindingClass.button.setOnClickListener {
        val resultValue = bindingClass.editTextTextPersonName.text.toString().toInt()
  when (resultValue){
      in 0..1000 ->  {
          bindingClass.textView2.visibility = View.VISIBLE
          bindingClass.textView2.text = "low "
      }
          in 1000..10000 -> {
              bindingClass.textView2.visibility = View.VISIBLE
              bindingClass.textView2.text = "norm "
          }
          else -> {
              bindingClass.textView2.visibility = View.VISIBLE
              bindingClass.textView2.text = "cool "
          }
  }
    }
//        bindingClass.b1.setOnClickListener{
//            val result = a + b
//            bindingClass.textViewTest.text = "Результат сложения: $result"
//        }
//        bindingClass.b2.setOnClickListener{
//            val result = a - b
//            bindingClass.textViewTest.text = "Результат вычитания: $result"
//        }
//        bindingClass.b3 .setOnClickListener{
//            val result = a * b
//            bindingClass.textViewTest.text = "Результат умножения: $result"
//        }
//        lateGlobalTextView = findViewById(R.id.textViewTest)
//        Log.d("Info", "onCreate")
////        btn = findViewById(R.id.myFirstButton)
//        btn.setOnClickListener {
//            lateGlobalTextView.text = "btnClick"
//        }
//val ex = 0
//        when (1) {
//           in 0..90 -> Log.i("1", "2")
//            // от 0 до 90
//
//            !in 0..90 -> Log.i("1", "2")
//            // не от 0 до 90
//
//            1, 2 -> 1
//            //  1 или 2
//
//        }
//    }

//fun onClickTest(view: View){
////    val textViewTest = findViewById<TextView>(R.id.textViewTest)
////   var globalTextView2 : TextView = findViewById(R.id.textViewTest)
////   var globalTextView3 = findViewById(R.id.textViewTest) as TextView
//
////    globalTextView?.text = "privet"
//    // здесь знак вопроса означает, что метод text будеи запущен только когда переменная не null
//
//
}


    override fun onResume() {
        super.onResume()
        Log.d("Info", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Info", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Info", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Info", "onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Info", "onStop ")
    }

}

