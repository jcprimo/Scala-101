package creator

import transactions.{QuickTransaction, Transaction}

object CreatorTransactionQuick extends ScenarioCreator{
  override def createTransaction(): Transaction = {
    // Parse the file and grab what you need
    // Returns a quick transaction
    QuickTransaction
  }
}
