# EqualityCheck
This file contains Assignment of Session 4 Day 3 Assignment 2 

Write a program illustarting 'equals' , '==', '!=' , 'ne', and 'eq' with different methods on how they can be used for different purpose.

The EqualityCheck class contains methods that compare two lists for equality or inequality based on their structure or memory address. This class can be used in any Scala application that requires list comparison.

Class Methods

The following are the methods available in the EqualityCheck class:

equalsOperation

def equalsOperation[T](firstList: List[T], secondList: List[T]): Boolean

This method compares two generic lists for structural equality and returns a boolean value. It checks if the elements in the two lists are equal in both order and value.

eqOperation

def eqOperation[T](firstList: List[T], secondList: List[T]): Boolean

This method checks if two lists refer to the same object in memory and returns a boolean value. It compares the memory address of the two lists to check if they are identical.

doubleEqualsOperation

def doubleEqualsOperation[T](firstList: List[T], secondList: List[T]): Boolean

This method compares two lists for structural equality using the double equals operator == and returns a boolean value. It checks if the elements in the two lists are equal in both order and value.

notEqualsOperation

def notEqualsOperation[T](firstList: List[T], secondList: List[T]): Boolean

This method compares two lists for structural inequality using the not equals operator != and returns a boolean value. It checks if the elements in the two lists are not equal in both order and value.

neOperation

def neOperation[T](firstList: List[T], secondList: List[T]): Boolean

This method checks if two objects are not identical (i.e., they have different memory addresses) and returns a boolean value. It compares the memory address of the two lists to check if they are different.
