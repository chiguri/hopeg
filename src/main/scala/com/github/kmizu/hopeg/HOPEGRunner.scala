package com
package github
package kmizu
package hopeg

object HOPEGRunner {
  def main(args: Array[String]): Unit = {
    val grammar = HOPEGParser.parse(
      """
        |S = REP("a") !.; REP(s) = s*;
      """.stripMargin)
    val evaluator = new HOPEGEvaluator(grammar)
    val input = "aaaaa"
    println(evaluator.evaluate("aaaaa", 'S).map{in => s"matched to ${input}"}.getOrElse{s"not matched to ${input}"})
  }
}
