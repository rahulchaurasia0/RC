import org.apache.spark.SparkContext
object jan22 {

  def main(args: Array[String]):Unit={

    val a=List(2,2,4,5,6,90,36,3,4,4,5,5)
    val sc=new SparkContext("local[*]", "remove_duplicate")
    val rdd1=sc.parallelize(a)
    rdd1.distinct().collect().foreach(println)
  }

}
