object reverse{
    def reverseString(str: String): String = {
        if (str.isEmpty) {
            return ""
        } else {
            return reverseString(str.tail) + str.head
        }
    }

    def main(args: Array[String]): Unit = {
        println(reverseString("Anupa Dulan"));
    }
}