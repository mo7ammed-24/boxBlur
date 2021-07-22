fun main() {
 println(boxBlur(mutableListOf(mutableListOf(1,1,1), mutableListOf(1,7,1), mutableListOf(1,1,1))))
}

fun boxBlur(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {

    var i=0
    var finalList=mutableListOf<MutableList<Int>>()
    while(i!=image.size-2){
        var insteadList=mutableListOf<Int>()
        var j=0
        while(j!=image[0].size-2){
            var summation=0
            for(k in i..i+2)
                for(z in j..j+2){
                    summation+=image[k][z]
                }
            insteadList.add(summation/9)
            j++
        }
        finalList.add(insteadList)
        i++
    }

    return finalList

}