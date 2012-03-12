package test.template

import junit.framework.TestCase
import kotlin.template.*
import kotlin.test.assertEquals

class HtmlTemplateTest : TestCase() {
    fun testTemplate(): Unit {
        val foo = "James"
        val bar = "x > 1"

        // Code generated by the following template expression:
        //
        // val actual = [Html]"<h1>$foo</h1> <p>hey $bar</p>"
        val builder = HtmlTemplate(array("<h1>", "</h1> <p>hey ", "</p>")).builder()
        builder.expression(foo)
        builder.expression(bar)
        val actual = builder.build()

        assertEquals("<h1>James</h1> <p>hey x &gt; 1</p>", actual)
    }
}