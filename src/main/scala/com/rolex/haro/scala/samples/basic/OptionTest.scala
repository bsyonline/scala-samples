package com.rolex.haro.scala.samples.basic

/**
  * Created with IntelliJ IDEA.
  * User: rolex
  * Date: 2016/05/25
  * Version: 1.0
  */
class OptionTest {

}

object OptionTest {

    def main(args: Array[String]) {

        // 选项用来表示一个值是可选的
        // Option是一个可选值的容器，如果值存在，Option = Some，否则Option = None
        val map: Map[String, Int] = Map("a" -> 4, "b" -> 2)
        val v1: Option[Int] = map.get("a")
        val v2: Option[Int] = map.get("d")
        println(v1)
        println(v2)
        println(show(v1))
        println(show(v2))

        val v3 = map.get("1").getOrElse(null)
        println(v3)

        val v4 = map.get("a").flatMap(i => map.get("b").map(y => y * i))
        val v5 = map.get("a").flatMap(i => printNum(i))
        println(v4)
    }

    def printNum(i: Int) = {
        i
    }

    def show(x: Option[Int]) = {
        x match {
            case Some(i) => i
            case None => null
        }
    }
}
