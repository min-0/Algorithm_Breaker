fun main(args: Array<String>) {
    val s1 = readLine()!!
    var answer = StringBuilder()
    
    for(i in s1) {
        if(i.isUpperCase()) {
            answer.append(i.toLowerCase())
        }
        else if(i.isLowerCase()) {
            answer.append(i.toUpperCase())
        }
    }
    println(answer.toString());
}