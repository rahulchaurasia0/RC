import org.apache.spark.SparkContext

object jan20 {

  def main(args: Array[String]): Unit={

    val data= List(4,8,10,11,13,14)
    val sc=new SparkContext("local[*]", "even-or-odd")
    val rdd1=sc.parallelize(data)
    val rdd2=rdd1.filter(x=> x%2==0)
    rdd2.collect().foreach(println)
    scala.io.StdIn.readInt()

  }
}
