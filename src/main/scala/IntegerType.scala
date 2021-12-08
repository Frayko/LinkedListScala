class IntegerType() extends TypeBuilder {
  private var range = 10000

  def this(range: Int) {
    this()
    this.range = range
  }

  override def getTypeName() = "Integer"

  override def create(): Int = (Math.random * range).toInt

  override def getTypeComparator(): Comparator = (o1: Any, o2: Any) => o1.asInstanceOf[Int] - o2.asInstanceOf[Int]
}
