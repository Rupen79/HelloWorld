package com.kumar.helloworld

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class HelloWorldTest extends AnyFlatSpec with should.Matchers {

  behavior of "Area of Triangle"

  it should "calculate the area of a triangle from the height and width " in {
    AreaOfTriangle.calculateArea(3, 4) shouldBe (6)
    AreaOfTriangle.calculateArea(6, 4) shouldBe (12)
    AreaOfTriangle.calculateArea(0, 4) shouldBe (0)
  }

}
