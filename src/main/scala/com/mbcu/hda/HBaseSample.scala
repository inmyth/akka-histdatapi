package com.mbcu.hda

import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.client.ConnectionFactory

object HBaseSample extends App {

  val conf = HBaseConfiguration.create()
  conf.set("hbase.master", "34.201.117.14:60000")
  conf.set( "hbase.zookeeper.property.clientPort", "2181" )

  val connection = ConnectionFactory.createConnection(conf)
  val admin = connection.getAdmin()

  // List the tables.
  val listtables = admin.listTables()
  listtables.foreach(println)
}