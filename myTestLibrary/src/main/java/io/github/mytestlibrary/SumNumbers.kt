package io.github.mytestlibrary

import timber.log.Timber

class SumNumbers {

    companion object{
        fun sumTwoNumbers(a:Int, b: Int): Int{
            Timber.d("Summing up two numbers")
            return a+b
        }

        fun multiplyTwoNumbers(a:Int, b:Int): Int{
            Timber.d("Summing up two numbers")
            return a*b
        }
    }
}