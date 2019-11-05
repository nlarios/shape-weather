package dk.shape.weather.core.utils

class ModelMappings (private val mappings: Map<Class<*>, Class<*>>){

    internal fun getMappings(): Map<Class<*>, Class<*>> {
        return mappings
    }
}