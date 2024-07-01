object longStrings{
    def filterStrings(strings: List[String]): List[String] = {
        return strings.filter(str => str.length > 5)
    }

    def main(args : Array[String]):Unit = {
        val inputStr = List("Anupa", "Dulan", "Siriwardana", "Yellow", "Green");
        println(filterStrings(inputStr));
    }
}