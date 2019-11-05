package dk.shape.weather.core.exception

class LocationNotFoundException(id: Int): EntityNotFoundException("Location", id)