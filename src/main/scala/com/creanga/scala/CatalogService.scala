package com.creanga.scala

case class Test(id:Int,name:Option[String]=None)

trait CatalogService {
  def getConnectorByName(imsOrgId: String, name: String, imsSandboxId: Option[String] = None, imsSandboxName: Option[String] = None): String
}
