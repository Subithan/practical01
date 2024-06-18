object main {
  def main(args: Array[String]): Unit = {
    temp(35)
  }
  def temp(c:Int):Unit={
    var f=c*1.8+32
    println(f)
  }
}
