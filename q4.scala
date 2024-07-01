object Sum{
    def sumOfEven(numList : List[Int]): Int = {
        val evenList:List[Int] = numList.filter(num => num % 2 == 0);
        return evenList.sum;
    }

    def main(args : Array[String]): Unit = {
        val numList = List(1,2,3,4,5,6,7);
        println(sumOfEven(numList));
    }
}