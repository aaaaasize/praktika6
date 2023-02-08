import kotlin.random.Random




fun main(args: Array<String>)
{
    var arr1 = IntArray(10) { Random.nextInt(1, 9) }
    var arr2 = IntArray(10) { Random.nextInt(1, 9) }
    var arr3 = DoubleArray(10)
    for (i in arr1.indices)
    {
        print(arr1[i].toString() + " ")
    }
    println()
    for (i in arr2.indices)
    {
        print(arr2[i].toString() + " ")
    }
    println()
   var num=0
    for (i in arr3.indices)
    {
        arr3[i] = arr1[i].toDouble() / arr2[i].toDouble()
        if (arr3[i] % 1 == 0!!.toDouble())
        {  num=num+1
        }
        println(arr3[i].toString() + " ")
    }
    println("Количество целых чисел равно ${(num)}")
}





