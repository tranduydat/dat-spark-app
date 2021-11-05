package org.example

import org.apache.log4j.Logger
import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.example.model.meta.MetaApp

/**
 * Hello world!
 *
 */
object App {
  @transient lazy val logger: Logger   = Logger.getLogger(getClass)

  def main(args: Array[String]): Unit = {
    val app = MetaApp(
      appName = "",
      beginDate = "",
      endDate = "",
      dateOffset = 0
    )

    val sparkConfig: SparkConf = new SparkConf()
      .setAppName(app.appName)
      .set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")

    val sparkSession: SparkSession = SparkSession.builder()
      .config(sparkConfig)
      .getOrCreate()
  }

  private def process(): DataFrame = {

  }
}
