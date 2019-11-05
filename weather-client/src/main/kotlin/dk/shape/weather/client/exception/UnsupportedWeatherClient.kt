package dk.shape.weather.client.exception

import dk.shape.weather.client.api.ClientType

class UnsupportedWeatherClient (clientType: ClientType):  UnsupportedOperationException("Client [${clientType.stringType}] not supported")