import org.apache.spark.SparkContext

object jan7 {

  def main(args:Array[String]): Unit = {


    val sc= new SparkContext("local[*]", "First-ScalaSpark-Program")
    val rdd1=sc.textFile("C:/Users/rc050/Desktop/rahul.txt")
    val rdd2 = rdd1.flatMap(x=>x.split(" "))
    val rdd3 = rdd2.map(x=>(x,1))
    val rdd4=rdd3.reduceByKey((x,y)=>x+y)
    val rdd5= rdd4.sortBy(x=>x._2)
    rdd5.collect().foreach(println)

    scala.io.StdIn.readInt()

  }

}
