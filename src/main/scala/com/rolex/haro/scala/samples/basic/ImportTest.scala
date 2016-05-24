package com.rolex.haro.scala.samples.basic

import java.io._
import java.util.{Hashtable => JavaTable} // 重命名

// 默认情况下，Scala 总会引入 java.lang._ 、scala._ 和 Predef._，以scala开头的包，在使用时都是省去scala.的

/**
  * Created with IntelliJ DIEA.
  * User: rolex
  * Date: 2016/05/04
  * Version: 1.0
  */
object ImportTest {

    var file = new File("")


    def main(args: Array[String]) {
        import java.util.ArrayList // import 可以在任务位置导入
        val list = new ArrayList()


        val queue = new JavaTable()
    }

}
