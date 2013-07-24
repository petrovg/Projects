/**
 */

//package learning.proj

import scala.collection.mutable

case class Product (id:String, price:BigDecimal)

class Inventory {
	val inv:mutable.Map[Product, BigDecimal] = mutable.Map().withDefaultValue(0)

	def add(p:Product, q:BigDecimal) = inv(p) += q

	def remove(p:Product, q:BigDecimal) = inv(p) -= q

	def show() = inv.map(e => s"${e._1.id} : ${e._2}")
}