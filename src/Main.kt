/*
Faça um algoritmo que leia um vetor inteiro de
10 posições e inverta os valores deste vetor
*/
fun main() {
    val limits : Int = 10
    val myVector = IntArray(limits)
    var inverter = limits-1


    for (i in 0..<10)
    {
        print("Digite o valor para ser armazenado no vetor [$i]: ")
        myVector[i] = readLine()!!.toInt()
    }
    for (i in 0..<10)
    {
        print(" "+myVector[i]+" ")
    }
    println(" ")
    for (i in 0..<10)
    {
        print(" "+myVector[inverter]+" ")
        inverter--
    }

}