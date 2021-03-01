package creator

import transactions.{ComplexTransaction, Transaction}

object CreatorTransactionComplex extends ScenarioCreator {

  // Now here we are creating the transaction
  override def createTransaction(): Transaction = {
    // Parse the file and grab what you need

    // Returns a complex Transaction
    ComplexTransaction
  }
}
