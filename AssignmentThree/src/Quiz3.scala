

object Quiz3 {
  def main(args:Array[String]){
    
   def sum(n:Int):Int=n match{
      case x if(x==0)=>x
      case x if(x>0)=> x+sum(x-1)
   }
  println(sum(5))
  }
}