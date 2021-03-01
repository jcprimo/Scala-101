package parser
import java.io.FileReader

object TransactionParser extends JSON1{

  // Extracts the body portion of the file
  def extractBody(): Unit ={

  }

  // Majority of microservices won't need headers, except the ones that need auth token
  def extractHeaders(): Unit ={

  }

  // is the equivalent to doStuff()
  def parseTransaction(transactionsContent: String): Unit ={
    // The String contains all the contents of the transaction
    val transaction = new FileReader(transactionsContent)
    obj
    val parsedFile = parseAll(value,transaction)
    parsedFile
    // from here we will decide how to parse it and turn it into objects

    // From Json file extract headers

    // extract body
  }

}
