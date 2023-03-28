package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{an, be}

class CharacterCapitalizationTest extends AnyFlatSpec {
  val characterCapitalization = new CharacterCapitalization

  it should "return the List after performing the capitalization task" in {
    val actualResult = characterCapitalization.capitalization(List("Jitendra", "Manish", "Prakhar", "Pallav"), 'a')
    val expectedResult = List("JitendrA", "MAnish", "PrAkhAr", "PAllAv")
    assert(actualResult == expectedResult)
  }

  // Letter to capitalize in the String should be in lowercase
  it should "throw a RuntimeException" in {
    an[RuntimeException] should be thrownBy {
      characterCapitalization.capitalization(List("Jitendra", "Manish", "Prakhar", "Pallav"), 'A')
    }
  }
}
