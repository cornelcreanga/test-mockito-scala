package com.creanga.scala.impl

import com.creanga.scala.CatalogService

class ComputeCatalogService extends CatalogService {

  override def getConnectorByName(imsOrgId: String,
                                  name: String,
                                  imsSandboxId: Option[String],
                                  imsSandboxName: Option[String]): String = {
    "something"
  }
}
