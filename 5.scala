object Main {
  def main(args: Array[String]): Unit = {
    val time = rtime()
    println(time)
  }

  def rtime(): Double = {
    val time = ep()+tempo()+ep()
    time
  }

  def ep(): Double = {
    2*8
  }

  def tempo(): Double = {
    3*7
  }

}