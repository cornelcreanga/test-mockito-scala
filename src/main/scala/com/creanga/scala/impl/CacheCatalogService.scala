package com.creanga.scala.impl

import com.creanga.scala.CatalogService

class CacheCatalogService(catalogService: CatalogService) extends CatalogService {

  override def getConnectorByName(imsOrgId: String,
                                  name: String,
                                  imsSandboxId: Option[String],
                                  imsSandboxName: Option[String]): String =
    catalogService.getConnectorByName(imsOrgId, name, imsSandboxId, imsSandboxName)
}
