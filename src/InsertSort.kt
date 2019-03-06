fun main(){
    var objectArray = arrayOf(3,4,5,6,7,8,1,2,9)
    insertSort(objectArray)
    for (i in objectArray.indices)
        print(objectArray[i])
}

private fun insertSort(objectArray: Array<Int>) {
    for (i in 0..(objectArray.lastIndex - 1)) {
        if (objectArray[i] > objectArray[i + 1]) {
            for (j in (i + 1) downTo 1) {
                if (objectArray.get(j) < objectArray[j - 1]) {
                    var tmp = objectArray[j]
                    objectArray[j] = objectArray[j - 1]
                    objectArray[j - 1] = tmp
                }
            }
        }
    }
}