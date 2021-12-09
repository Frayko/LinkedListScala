object Main extends App {
  def test(count: Int): Unit = {
    val typeBuilder = TypeFactory.getBuilder(MyTypes.Integer)
    val list = new LinkedList[Int]()

    for(i <- 0 until count) {
      list.pushFront(typeBuilder.create.asInstanceOf[Int])
    }

    val start = System.nanoTime
    list.sort(typeBuilder.typeComparator)
    val time = (System.nanoTime - start).toDouble / 1_000_000_000.0
    println(s"Список из ${list.getSize} элементов был успешно отсортирован за ${BigDecimal(time).setScale(3, BigDecimal.RoundingMode.HALF_UP)} cек")
  }

  test(100)
  test(1000)
  test(10000)
  test(100000)
  test(1000000)
}