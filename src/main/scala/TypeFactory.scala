import MyTypes.myType

import java.util

object TypeFactory {
  def getTypeNameList: util.ArrayList[String] = {
    val list: util.ArrayList[String] = new util.ArrayList[String]
    for (t <- MyTypes.values) {
      list.add(String.valueOf(t))
    }
    list
  }

  def getBuilder(t : myType): TypeBuilder = t match {
    case MyTypes.Integer => new IntegerType
    case MyTypes.String => new StringType
    case _ => System.out.println("Wrong type, return null")
      null
  }
}
