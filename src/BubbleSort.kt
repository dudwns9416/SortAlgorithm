fun main(){
    var objectArray:Array<Int> = arrayOf(4,5,6,1,2,3,7,8,9)
    bubbleSort(objectArray)
    for (i in objectArray.indices)
        print(objectArray[i])
}

private fun bubbleSort(objectArray: Array<Int>) {
    for (index in 0..(objectArray.lastIndex)) {
        val sortRange = objectArray.lastIndex - index - 1
        for (compareIndex in 0..sortRange) {
            if (objectArray[compareIndex] > objectArray[compareIndex + 1]) {
                var tmp = objectArray.get(compareIndex)
                objectArray[compareIndex] = objectArray[compareIndex + 1]
                objectArray[compareIndex + 1] = tmp
            }
        }
    }
}