package org.example.model.meta

import com.typesafe.config.ConfigFactory

import java.io.File

object MetaConfig {
  private val props = ConfigFactory.parseFile(new File("app.properties"))

  case class App(appName: String,
                 beginDate: String,
                 endDate: String,
                 dateOffset: Int)

  case class Phoenix(connectionString: String = props.getString("READING_PHOENIX_CONNECTION_STRING"),
                     format: String = "org.apache.phoenix.spark")

  case class MySql(driver: String = "com.mysql.jdbc.Driver",
                   user: String = props.getString("READING_MYSQL_USER"),
                   password: String = props.getString("READING_MYSQL_PASSWORD"),
                   batchSize: Int = props.getInt("READING_MYSQL_BATCH_SIZE"),
                   isTruncate: Boolean = props.getBoolean("READING_MYSQL_IS_TRUNCATE"))
}
