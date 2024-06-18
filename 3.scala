object main {
  def main(args: Array[String]): Unit = {
    vol(5)
  }
  def vol(r:Int):Unit={
    var v=4/3*math.Pi*math.pow(r,3)
    println(v)
  }
}
