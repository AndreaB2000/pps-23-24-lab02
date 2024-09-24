package stuff

object NegativePredicates extends App:
    val valNeg: (String => Boolean) => (String => Boolean) =
        // predicate => (string => !predicate(string))
        predicate => !predicate(_)
    
    def defNeg(predicate: String => Boolean): String => Boolean =
        !predicate(_)
    
    def genericNeg[T](predicate: T => Boolean): T => Boolean =
        !predicate(_)
