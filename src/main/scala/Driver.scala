package com.knoldus

import scala.util.{Try, Success, Failure}

object Driver extends App {
  // Used exception handling with Try match block
  Try {
    val equalityCheckObject = new EqualityCheck
    val firstList = List(1, 2, 3, 4)
    val secondList = List(2, 3, 4, 5)
    val thirdList = List(1, 2, 3, 4)
    val fifthList = secondList

    println("Equals Operation Result")
    println(s"$firstList and $secondList: " + equalityCheckObject.equalsOperation(firstList, secondList))
    println(s"$firstList and $thirdList: " + equalityCheckObject.equalsOperation(firstList, thirdList))
    println(s"$fifthList and $secondList(With same memory address): " + equalityCheckObject.equalsOperation(fifthList, secondList))

    println("Eq Operation Result")
    println(s"$firstList and $secondList: " + equalityCheckObject.eqOperation(firstList, secondList))
    println(s"$firstList and $thirdList: " + equalityCheckObject.eqOperation(firstList, thirdList))
    println(s"$fifthList and $secondList(With same memory address): " + equalityCheckObject.eqOperation(fifthList, secondList))

    println("Double Equals Operation(==) Result")
    println(s"$firstList and $secondList: " + equalityCheckObject.doubleEqualsOperation(firstList, secondList))
    println(s"$firstList and $thirdList: " + equalityCheckObject.doubleEqualsOperation(firstList, thirdList))
    println(s"$fifthList and $secondList(With same memory address): " + equalityCheckObject.doubleEqualsOperation(fifthList, secondList))

    println("Not Equals Operation(!=) Result")
    println(s"$firstList and $secondList: " + equalityCheckObject.notEqualsOperation(firstList, secondList))
    println(s"$firstList and $thirdList: " + equalityCheckObject.notEqualsOperation(firstList, thirdList))
    println(s"$fifthList and $secondList(With same memory address): " + equalityCheckObject.notEqualsOperation(fifthList, secondList))

    println("Ne Operation Result")
    println(s"$firstList and $secondList: " + equalityCheckObject.neOperation(firstList, secondList))
    println(s"$firstList and $thirdList: " + equalityCheckObject.neOperation(firstList, thirdList))
    println(s"$fifthList and $secondList(With same memory address): " + equalityCheckObject.neOperation(fifthList, secondList))

  } match {
    case Success(result) => println("Program executed successfully")
    case Failure(exception) => println("An exception occurred: " + exception.getMessage)
  }
}
