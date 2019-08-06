package com.creanga.scala

import com.creanga.scala.impl.CacheCatalogService
import org.mockito.Mockito.{mock, times, verify, when}
import org.scalatest.{BeforeAndAfterEach, FunSuite}

class CacheCatalogServiceSuite extends FunSuite with BeforeAndAfterEach{

  var catalog: CatalogService = _
  var cacheCatalogService : CacheCatalogService = _

  override def beforeEach(): Unit = {
    catalog = mock(classOf[CatalogService])
    cacheCatalogService = new CacheCatalogService(catalog)
  }

  test("invoke without optional params") {
    when(catalog.getConnectorByName("ims","name")).thenReturn("something")
    assert(cacheCatalogService.getConnectorByName("ims","name") == "something")
    assert(cacheCatalogService.getConnectorByName("ims","name") == "something")
    verify(catalog, times(2)).getConnectorByName("ims","name")
  }

  test("invoke with optional params") {
    when(catalog.getConnectorByName("ims","name", None, None)).thenReturn("something")
    assert(cacheCatalogService.getConnectorByName("ims","name", None, None) == "something")
    assert(cacheCatalogService.getConnectorByName("ims","name", None, None) == "something")
    verify(catalog, times(2)).getConnectorByName("ims","name", None, None)
  }

}
