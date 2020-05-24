package recursive

class SampleGateway(private val driver: SampleDriver) {
    fun execute() {
        println("execute gateway")
        driver.execute()
    }
}