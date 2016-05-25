package com.rolex.haro.scala.samples.basic

/**
  * Created with IntelliJ IDEA.
  * User: rolex
  * Date: 2016/05/25
  * Version: 1.0
  */
class SetTest {

}

object SetTest {
    def main(args: Array[String]) {

        // set 是不重复的 无序的
        // 和list一样默认是immutable的，对set操作会产生新的set，原set不变
        val set1: Set[Int] = Set(2, 1, 3, 4, 1)
        println("set1 = " + set1)

        val set2 = set1.+(2, 0) // 添加元素
        println("set2 = " + set2)

        val set3 = set2.-(4) // 移除元素
        println("set3 = " + set3)

        val set4 = set1.&(set3) // 交集
        val set5 = set1.intersect(set3)
        println("set4 = " + set4)
        println("set5 = " + set5)

        val set6 = set2.&~(set1) // 从set2中去掉set1
        val set7 = set1.&~(set2)
        println("set6 = " + set6)
        println("set7 = " + set7)

        val set8 = set1.++(set2) // 合并
        val set9 = set1 ++ set2
        println("set8 = " + set8)
        println("set9 = " + set9)

        val sb = new StringBuilder()
        val set10 = set1.addString(sb)
        println("set10 = " + set10)

        println(set1.apply(1)) // 是否包含
        println(set1.contains(1))

        println(set1.count(i => i > 5)) // set 中大于5的个数

        val set11 = Set(1, 2, 3).diff(Set(2, 3, 4)) // 和&～等效
        val set12 = Set(2, 3, 4).diff(Set(1, 2, 3))
        println("set11 = " + set11)
        println("set12 = " + set12)

        val set13 = set1.drop(2) // 丢弃前2元素
        println("set13 = " + set13)

        println(set1.product) // 所有数值元素相乘

    }
}
