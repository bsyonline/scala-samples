package com.rolex.haro.scala.samples.basic

/**
  * Created with IntelliJ IDEA.
  * User: rolex
  * Date: 2016/05/26
  * Version: 1.0
  */
class AbstractClassTest {

}

object AbstractClassTest {
    def main(args: Array[String]) {
        val t = new MathTeacher
        println(t.name)
        t.teach
    }
}

// 抽象类用abstract声明
abstract class Teacher {
    // 方法不写方法体，成员不赋初值就是抽象的
    var name: String

    def teach
}

class MathTeacher extends Teacher {
    override var name = "tom"

    override def teach: Unit = {
        println("teach math")
    }
}

