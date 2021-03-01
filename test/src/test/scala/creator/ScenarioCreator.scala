package creator

import transactions.Transaction

// Using the abstract factory design pattern to accomplish the creation of
// the three different transaction categories.
abstract class ScenarioCreator {

  def createTransaction(): Transaction

  // What is our deliver function. What do we want it to do
  // Create the transaction, or it should be already created?
  def parse(inputFile: String): Unit = {
    val transaction: Transaction = createTransaction()
    transaction.parse(inputFile)
  }
}
