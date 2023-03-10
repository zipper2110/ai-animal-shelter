package ai.shelter.shelterbackend.service

import ai.shelter.shelterbackend.entity.Location
import ai.shelter.shelterbackend.repository.LocationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/* generated by ChatGPT */
@Service
class LocationService {
    @Autowired
    lateinit var locationRepository: LocationRepository

    fun findById(id: Long): Location? {
        return locationRepository.findById(id).orElse(null)
    }

    fun save(location: Location): Location {
        return locationRepository.save(location)
    }

    fun deleteById(id: Long) {
        locationRepository.deleteById(id)
    }
}