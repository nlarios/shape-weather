package dk.shape.weather.core.exception

abstract class EntityNotFoundException(entity: String, id: Int) : Exception("$entity '$id' was not found")