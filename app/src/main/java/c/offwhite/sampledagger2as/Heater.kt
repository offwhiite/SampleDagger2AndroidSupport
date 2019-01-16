package c.offwhite.sampledagger2as

import javax.inject.Inject

class Heater @Inject constructor() {

    fun getTemperature(): String {
        return "38度"
    }
}