package transactions

import parser.TransactionParser

// Transaction Implementation
case object ComplexTransaction extends Transaction{
  override def parse(inputFile: String): Unit = {
    TransactionParser.parseTransaction(inputFile)

    println("Parsing for Complex Transactions")
  }
}


