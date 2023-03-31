package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class EqualityCheckTest extends AnyFunSuite {
  val equalityCheckObject = new EqualityCheck

  test("To perform equals Operation on List of type String") {
    val firstList = List("Hello", "World")
    val secondList = List("Hello", "World")
    assert(equalityCheckObject.equalsOperation(firstList, secondList) === true)
  }
  test("To perform eq Operation on List of type Int") {
    val firstList = List(1, 2, 3, 4)
    val secondList = List(2, 3, 4, 5)
    val thirdList = firstList
    assert(equalityCheckObject.eqOperation(firstList, secondList) === false)
    assert(equalityCheckObject.eqOperation(firstList, thirdList) === true)
  }
  test("To perform doubleEquals(==) Operation on List of type String") {
    val firstList = List("Hello", "World")
    val secondList = List("Hello", "World")
    assert(equalityCheckObject.doubleEqualsOperation(firstList, secondList) === true)
  }
  test("To perform notEquals(!=) Operation on List of type String") {
    val firstList = List(1, 2, 3, 4)
    val secondList = List(4, 5, 6, 7)
    assert(equalityCheckObject.notEqualsOperation(firstList, secondList) === true)
  }
  test("To perform Equals Operation on List with null value") {
    val firstList = List(1, 2, 3, 4)
    val secondList = null
    assert(equalityCheckObject.equalsOperation(firstList, secondList) === false)
  }
}
