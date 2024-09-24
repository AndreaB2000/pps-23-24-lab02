package stuff

object FunctionComposition extends App:
    def compose(f: Int => Int, g: Int => Int): Int => Int =
        x => f(g(x))
