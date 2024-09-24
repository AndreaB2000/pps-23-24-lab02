package stuff

object Positive extends App:
    val valPositive: Int => String = _ match
        case n if n >= 0 => "positive"
        case _ => "negative"
    
    def defPositive(x: Int): String =
        x match
            case n if n >= 0 => "positive"
            case _ => "negative"
