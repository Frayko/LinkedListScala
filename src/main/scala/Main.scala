object Main extends App {
  def test(count: Int): Unit = {
    val typeBuilder = TypeFactory.getBuilder(MyTypes.Integer)
    val list = new LinkedList[Int]()

    for(i <- 0 until count) {
      list.pushFront(typeBuilder.create().asInstanceOf[Int])
    }

    val start = System.nanoTime
    list.sort(typeBuilder.getTypeComparator())
    val time = (System.nanoTime - start).toDouble / 1_000_000_000.0
    System.out.printf("Список был успешно отсортирован за %.3f cек\n", time)
  }

  test(100)
  test(1000)
  test(10000)
  test(100000)
  test(1000000)
}