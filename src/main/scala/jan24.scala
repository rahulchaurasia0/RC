import org.apache.spark.SparkContext
object jan24 {

  def main(args: Array[String]):Unit= {

    val a= List("Rahul", "Rahul", "Ram", "Vinay")
    val sc=new SparkContext("local[*]","Search_the_element")
    val rdd=sc.parallelize(a)
    val c="Rahul"
    val d=rdd.filter(x=>x==c)
    d.collect().foreach(println)
  }
}
