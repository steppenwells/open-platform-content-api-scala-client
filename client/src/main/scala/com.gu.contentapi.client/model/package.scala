package com.gu.contentapi.client

package object model {
  private[model] def not[A](f: A => Boolean): A => Boolean = !f(_)

  private[model] def isPaginationParameter: String => Boolean = List("page", "page-size").contains(_)
}