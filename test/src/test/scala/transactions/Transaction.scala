package transactions

/**
 * Traits in scala are seen as interface equivalent in Java.
 * lets define all the functions we will use to create our transactions
 * three categories
 * QUICK
 * COMPLEX
 * BATCH
 */

trait Transaction {

  // Do we need to take any actions in here?
  // we will
  // Here we will parse the transaction to create the object
  def parse(inputFile: String)
}
