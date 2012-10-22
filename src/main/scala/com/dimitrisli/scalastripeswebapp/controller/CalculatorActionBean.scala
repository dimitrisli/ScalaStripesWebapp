package com.dimitrisli.scalastripeswebapp.controller

import net.sourceforge.stripes.action._
import net.sourceforge.stripes.validation.{SimpleError, ValidationErrors, ValidationMethod, Validate}
import reflect.BeanProperty


class CalculatorActionBean extends BaseActionBean {

  @BeanProperty @Validate(required=true) var numberOne: Double = _
  @BeanProperty @Validate(required=true) var numberTwo: Double = _
  @BeanProperty var result: Double = _

  @DefaultHandler
  def addition: Resolution = {
    result = getNumberOne + getNumberTwo
    new ForwardResolution("/index.jsp");
  }

  def division: Resolution = {
    result = getNumberOne / getNumberTwo
    new ForwardResolution("/index.jsp");
  }

  @ValidationMethod(on=Array("division"))
  def avoidDevideByZero(errors: ValidationErrors): Unit =
    if (getNumberTwo == 0)
      errors.add("numberTwo", new SimpleError("Dividing by zero is not allowed."))
}
