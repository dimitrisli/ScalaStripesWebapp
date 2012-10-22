package com.dimitrisli.scalastripeswebapp

import controller.CalculatorActionBean
import org.junit.{BeforeClass, Assert, Test}


class CalculatorActionBeanTest {

  @Test
  def testAddition = {
    var calculator = new CalculatorActionBean()
    calculator.numberOne = 1d
    calculator.numberTwo = 2d
    calculator.addition
    Assert.assertEquals(3d, calculator.result,10e-6)
  }

  @Test
  def testDivision = {
    var calculator = new CalculatorActionBean()
    calculator.numberOne = 1d
    calculator.numberTwo = 2d
    calculator.division
    Assert.assertEquals(0.5, calculator.result,10e-6)
  }
}
