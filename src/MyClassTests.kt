import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class Tests {
    @Test
    fun `This should just run`() {
        assertEquals(MyClass().test(), "Test")
    }
}
