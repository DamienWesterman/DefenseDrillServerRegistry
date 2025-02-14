# DefenseDrillServerRegistry
Spring Server Registry Microservice for the [DefenseDrillWeb backend](https://github.com/DamienWesterman/DefenseDrillWeb/).

# Purpose
This microservice acts as a record of all the running spring microservices while performing load balancing operations. They must each register their IP and port with this server registry, allowing for inter-service communication. For example, for the [mvc microservice](https://github.com/DamienWesterman/DefenseDrillMVC) to interact with the [rest-api microservice](https://github.com/DamienWesterman/DefenseDrillRestAPI), the mvc must retrieve the rest-api's IP and port from this service to access the api. This allows for a more flexible approach to a microservice architecture as other microservices do not need to keep track of each others' addresses. Instead, it allows for name based searching in the format of `lb://rest-api`, 'lb' standing for 'load balanced'.
