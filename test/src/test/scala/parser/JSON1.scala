package parser

import scala.util.parsing.combinator._


/**
 * Parser obtained from Programming In Scala Third Edition Book
 * Page 722, answer provided by the creator of Scala Martin Odersky.  I am just a copy cat
 * Enjoy the results =)
 * (~) Sequential Composition (andThen)
 * (|) Alternative (orElse)
 */
class JSON1 extends JavaTokenParsers {

  // In concrete words this will look like
  // def expr: Parser[Any] =
  //   term andThen rep(("+" andThen term) orElse
  //                    ("-" andThen term)
//  def expr: Parser[Any] = term~rep("+" | "-"~term)
//  def term: Parser[Any] = factor~rep("*"~factor | "/"~factor)
//  def factor: Parser[Any] = floatingPointNumber | "("~expr~")"

  def obj: Parser[Map[String,Any]] =
    "{"~> repsep(member,",") <~"}" ^^ (Map() ++ _)

  def arr: Parser[List[Any]] =
    "[" ~> repsep(value, ",") <~"]"

  // Explain the code muchachito
  def member: Parser[(String, Any)] =
    stringLiteral~":"~value ^^
    { case name~":"~value =>(name,value) }

  // Explain what the hell is going on here
  // What are the pipes for?
  def value: Parser[Any] = (
    obj
    | arr
    | stringLiteral
    | floatingPointNumber ^^ (_.toDouble)
    | "null" ^^ (x => null)
    | "true" ^^ (x => true)
    | "false" ^^ (x => false)
  )

}
