package siimeon

import java.io.*
import com.fasterxml.jackson.module.kotlin.*

data class DoubleInput(val num: Int)
data class DoubleOutput(val result: Int)

class Double {
    val mapper = jacksonObjectMapper()

    fun handler(input: InputStream, output: OutputStream): Unit {
        val inputObj = mapper.readValue<DoubleInput>(input)
        val double = inputObj.num + inputObj.num
        mapper.writeValue(output, DoubleOutput(double))
    }
}
