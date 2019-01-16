package c.offwhite.sampledagger2as

import javax.inject.Inject

class CoffeeMaker @Inject constructor(private val heater: Heater) {

    fun getTemperature() : String {
        return heater.getTemperature()
    }
}