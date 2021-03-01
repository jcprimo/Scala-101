import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder
import creator.CreatorTransactionComplex

object Engine extends App {
//  val props = new GatlingPropertiesBuilder()
//    .resourcesDirectory(IDEPathHelper.mavenResourcesDirectory.toString)
//    .resultsDirectory(IDEPathHelper.resultsDirectory.toString)
//    .binariesDirectory(IDEPathHelper.mavenBinariesDirectory.toString)

//  /Gatling.fromMap(props.build)

    // Lets create objects and define them as we go

    //going with the same rationale, we just need to identify the category type
    // then create the transaction accordingly
    // read from file
    // create switch statement

    // create the objects accordingly

    // Given a data file we want to parse it and organize it into objects
    // create a sequenital scenario and run it according to its attributes
  val inputFileName = "/Users/julio.primo/Development/test/src/test/resources/transactions.json"
  CreatorTransactionComplex.createTransaction().parse(inputFileName)

}
  // We will use this file as our starting point
  // The end goal is to have a roadmap to understand Scala better from a Java perspective
  // incorporating some bash scripting style along with Functional Programming that
  // will be learned and improved along this code roadmap.


  // On this road map we will understand the following concepts
  // - Variable assignment
  // - Conditional Statements
  // - Iterables and Collections
  // - Read from file
  // - Parse file content
  // - Err Handling




