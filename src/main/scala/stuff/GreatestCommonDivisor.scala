package stuff

object GreatestCommonDivisor extends App:
    @annotation.tailrec
    def gcd(a: Int, b: Int): Int =
        b match
            case 0 => a
            case _ => a match
                case 0 => b
                case n if n < b => gcd(n, b % n)
                case n if n >= b => gcd(b, n % b)

    println(gcd(120, 360))
