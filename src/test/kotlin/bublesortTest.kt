import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class bublesortTest {

    @Test
    fun `test sort array of integer`() {
        assertTrue(
            arrayOf(1, 2, 4, 5, 6, 6, 7, 8, 9) contentEquals
                    bublesort.apply(arrayOf(5, 2, 6, 7, 9, 6, 1, 8, 4))
        )
    }

    @Test
    fun `test sort array of string`() {
        assertTrue(
            arrayOf("1", "2", "411", "5", "62", "67", "7", "8", "9") contentEquals
                    bublesort.apply(arrayOf("5", "2", "67", "7", "9", "62", "1", "8", "411"))
        )
    }

    @Test
    fun `test sort array of double`() {
        assertTrue(
            arrayOf(1.006, 1.03, 1.09, 1.1215, 1.38, 1.45, 1.454, 1.467, 1.546) contentEquals
                    bublesort.apply(arrayOf(1.03, 1.45, 1.454, 1.1215, 1.006, 1.546, 1.467, 1.38, 1.09))
        )
    }
}