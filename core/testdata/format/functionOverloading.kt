class A<T>

/**
 * my fun 1
 */
fun <T: Any> A<T>.foo(expected: T): A<T> = throw UnsupportedOperationException("...")

/**
 * my fun 2
 */
fun <T: BigDecimal> A<T>.foo(expected: T): A<T> = throw UnsupportedOperationException("...")