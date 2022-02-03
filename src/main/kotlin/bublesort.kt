class bublesort {
    companion object Factory {
        fun apply(array: Array<Any>): Array<Any> {
            array.bubbleSort()
            return array
        }

        private fun Array<Any>.bubbleSort() {
            var sorted = false
            while (!sorted) {
                sorted = true
                for (i in 1 until this.size) {
                    if (this[i - 1] as Comparable<Any> > this[i] as Comparable<*>) {
                        this.swap(i - 1, i)
                        sorted = false
                    }
                }
            }
        }

        private fun Array<Any>.swap(index1: Int, index2: Int) {
            val buffer = this[index1]
            this[index1] = this[index2]
            this[index2] = buffer
        }
    }

}
