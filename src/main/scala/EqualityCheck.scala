package com.knoldus

/*
 * @param firstList The first list to compare.
 * @param secondList The second list to compare.
 */
class EqualityCheck {
  // Compares two generic lists for structural equality.
  def equalsOperation[T](firstList: List[T], secondList: List[T]): Boolean = {
    firstList.equals(secondList)
  }

  // Checks if two lists refer to the same object.
  def eqOperation[T](firstList: List[T], secondList: List[T]): Boolean = {
    firstList.eq(secondList)
  }

  // Compares two lists for structural equality using double equals operator.
  def doubleEqualsOperation[T](firstList: List[T], secondList: List[T]): Boolean = {
    val result = (firstList == secondList)
    result
  }

  // Compares two lists for structural inequality using not equals operator.
  def notEqualsOperation[T](firstList: List[T], secondList: List[T]): Boolean = {
    val result = (firstList != secondList)
    result
  }
  // ne method checks if two objects are not identical (i.e., they have different memory addresses)
  def neOperation[T](firstList: List[T], secondList: List[T]): Boolean = {
    firstList.ne(secondList)
  }

}
