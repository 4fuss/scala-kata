import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

@RunWith(classOf[JUnitRunner])
class StrCalcSpec extends Specification{
  "StrCalc#add" should{
    "return same value as given parameter when no. of parameters is 1" in {
      StrCalc.add("3") must equalTo(3)
    }
    
    "return zero when empty string is passed in" in {
      StrCalc.add("") must equalTo(0)      
    }
    
    "add two given numbers when parameters are given as 'n,n'" in {
      StrCalc.add("2,3") must equalTo(5)      
    }
    	
  } 
}