package msazonov.hw_06

/***
 * 5. Write a Scala application, using the App trait, that prints its command-line arguments in reverse order,
 * separated by spaces. For example, scala Reverse Hello World should print World Hello.
 */
object Task05 extends App {
    for(s <- args.reverse) print(s)
}
