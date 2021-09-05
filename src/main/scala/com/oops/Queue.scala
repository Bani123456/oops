package com.oops
import scala.collection.mutable.ListBuffer

trait Queue {

  def enqueue(pushedElement : Int): Unit

  def dequeue(q: ListBuffer[Int]) : Int ={

    val removedElement = q.head
    q.remove(0)
    removedElement
  }

}
