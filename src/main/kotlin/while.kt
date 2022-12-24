fun main()
{
    println("enter the no:")
    var n= readLine()?.toInt()
    var i=0
    if(n!=null){
        while(i<=n)
        {
            println(i)
            i++
        }
    }
}