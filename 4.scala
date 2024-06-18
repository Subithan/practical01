object Main {
  def main(args: Array[String]): Unit = {
    val result = fcprice(5)
    println(result)
  }

  def fcprice(c: Double): Double = {
    val fprice = cprice(c) - discount(cprice(c)) + ship(c)
    fprice
  }

  def cprice(c: Double): Double = {
    val price = 24.95 * c
    price
  }

  def discount(price: Double): Double = {
    val dis = price * 0.4
    dis
  }

  def ship(c: Double): Double = {
    val cost = 150 + (c - 50) * 0.75
    cost
  }
}

