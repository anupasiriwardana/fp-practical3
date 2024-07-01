object Mean{
    def findMean(num1:Int, num2:Int):Float = {
        val mean: Float = (num1.toFloat + num2.toFloat)/2.0f;
        return mean;
    }

    def main(args: Array[String]):Unit = {
        printf("The mean of 25 and 10 is %.2f", findMean(25,10));
    }
}