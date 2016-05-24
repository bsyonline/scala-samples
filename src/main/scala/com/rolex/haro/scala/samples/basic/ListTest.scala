package com.rolex.haro.scala.samples.basic

/**
  * Created with IntelliJ IDEA.
  * User: rolex
  * Date: 2016/05/24
  * Version: 1.0
  */
class ListTest {

}

object ListTest {
    def main(args: Array[String]) {
        // 字符串列表
        val site: List[String] = List("google", "baidu")
        // int列表
        val num: List[Int] = List(1, 2, 3)
        // 空列表
        val empty: List[Nothing] = List()
        // 二维列表
        val dim: List[List[Int]] = List(List(1, 2, 3), List(1), List(1, 3))


        val list1 = List(1 :: (2 :: (3 :: Nil)), 1 :: Nil, 1 :: (3 :: Nil)) // ::可表示List
        val list2 = Nil // 等效于List()
        println("1. " + list1)
        println("2. " + list2)

        // 列表操作
        println("3. " + site.head)
        println("4. " + site.tail)
        println("5. " + site.isEmpty)
        println("6. " + num.init) // 返回列表，最后一个元素除外
        println("7. " + num.forall(i => i > 0)) // 检查是否所有元素>0

        val l1 = List(1, 2, 3)
        val l2 = List(2, 3)
        println("8. " + l1.intersect(l2)) // 求交集
        println("9. " + num.drop(1))
        val l3 = num.dropWhile(i => i > 2)
        println("10. " + l3) // 从左到右>2丢弃, 返回新列表

        val l4 = List(1, 1, 1, 1, 1)
        println("11. " + l4.distinct)

        println("12. " + num.apply(2) + num(2)) // 按索引获取元素

        // 连接
        val list3 = List(1, 2, 3)
        val list4 = List("a", "b", "c")

        val list5 = list3 ::: list4
        println("13. " + list5)

        val list50 = list3 :: List(1) // 不明白
        println("14. " + list50)

        val list500 = list3 :+ "a" // 添加元素
        println("15. " + list500)

        val list6 = list3.:::(list4) // 在list3前添加list4
        println("16. " + list6)

        val list60 = list3.::(1) // 在list3前添加1
        println("17. " + list60)

        val list7 = List.concat(list3, list4)
        println(list7)

        // 添加元素
        val list8 = List.fill(2)("a") // 重复a 2次
        println(list8)

        val list9 = List.tabulate(4)(n => n * n)
        println(list9)

        // 反转
        val list10 = list9.reverse
        println(list10)
    }
}
