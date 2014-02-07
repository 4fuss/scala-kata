object StrCalc {
  
  def add(input: String): Int = {
    
    val pattern = "([0-9],[0-9])".r
    
    input match {
      case "" => 0
      case pattern(s) => s(0).toString.toInt + s(2).toString.toInt 
      case x => x.toInt
    }
  }

}