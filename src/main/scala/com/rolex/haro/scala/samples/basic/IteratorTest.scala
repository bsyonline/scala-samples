package com.rolex.haro.scala.samples.basic

/**
  * Created with IntelliJ IDEA.
  * User: rolex
  * Date: 2016/05/26
  * Version: 1.0
  */
class IteratorTest {

}

object IteratorTest {
    def main(args: Array[String]) {
        val it = Iterator(1, 2, 3, 4)
        while (it.hasNext) {
            println(it.next())
        }

        println(Iterator(1, 2, 3, 4).seq) //

        println(Iterator(1, 2, 3, 4).size)

        println(Iterator(1, 2, 3, 4).max)

        val it1 = Iterator(1, 2, 3, 4).slice(1, 2) // 开始于第 1 个元素、结束于第 2 个元素
        while (it1.hasNext) {
            println(it1.next())
        }
    }
}