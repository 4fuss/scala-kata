package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  
  val negatives: Set = i => i > 0 & i < 10
  
  printSet(negatives)
  
  printSet(map(negatives, x => x*2))
}
