package com.rolex.haro.scala.samples.basic

/**
  * Created with IntelliJ IDEA.
  * User: rolex
  * Date: 2016/05/26
  * Version: 1.0
  */
class CompanionTest {

}

object CompanionTest {

    def main(args: Array[String]) {
        println(Dog.newName)
    }

}

class Dog {
    // 伴生类
    val id = Dog.newName
    // 可以访问伴生对象的所有方法和属性，包括private
    private var age = 10

    def aClass(age: Int): Unit = {
        this.age += age
    }
}

// object通常用于存储静态的公共的方法和属性
// 静态的内容不会在加载的时候执行，而是在第一次执行时加载
object Dog {
    // 伴生对象
    var name = "a"

    /*private*/ def newName = {
        // 加上private后，伴生类仍然可以访问，外部对象不能访问
        name = "b"
        name
    }
}

