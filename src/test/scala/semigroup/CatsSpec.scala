package semigroup

import cats.Semigroup
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CatsSpec extends AnyFunSpec with Matchers {
  import cats.implicits._
  describe("Semigroup on Integer") {
    it("will combine two or more integers") {
      Semigroup[Int].combine(1, 2) shouldEqual 3
      Semigroup[Option[Int]].combine(Some(1), Some(2)) shouldEqual Some(3)
    }
  }
}
