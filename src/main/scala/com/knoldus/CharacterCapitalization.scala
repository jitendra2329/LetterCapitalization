package com.knoldus

class CharacterCapitalization {
  def capitalization(list: List[String], characterToCapitalize: Character): List[String] = {

    // The character that is to be capitalized, should be in lowercase only
    if (characterToCapitalize.toString == characterToCapitalize.toString.toLowerCase) {
      list.map(_.foldLeft("")((string, character) => {
        if (character == characterToCapitalize) string + character.toUpper
        else string + character
      }))
    } else throw new RuntimeException("Invalid character to capitalize!!")
  }
}
