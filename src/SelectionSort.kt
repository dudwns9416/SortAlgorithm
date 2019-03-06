fun main(args:Array<String>){
    var objectArray = arrayOf(4,5,6,1,2,3,7,8,9)
    selectionSort(objectArray)
    for (i in objectArray.indices)
        print(objectArray[i])
}

private fun selectionSort(objectArray: Array<Int>) {
    for (i in 0 until objectArray.lastIndex - 1) {
        var minIndex: Int = i
        for (j in (i + 1) until objectArray.lastIndex) {
            if (objectArray[minIndex] > objectArray[j]) {
                minIndex = j
            }
        }
        if (i != minIndex) {
            var tmp = objectArray[i]
            objectArray[i] = objectArray[minIndex]
            objectArray[minIndex] = tmp
        }
    }
}