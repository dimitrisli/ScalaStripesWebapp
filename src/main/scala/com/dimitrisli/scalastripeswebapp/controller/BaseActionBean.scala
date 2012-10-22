package com.dimitrisli.scalastripeswebapp.controller

import net.sourceforge.stripes.action.{ActionBeanContext, ActionBean}
import reflect.BeanProperty


class BaseActionBean extends ActionBean {

  @BeanProperty var context: ActionBeanContext = _

}
