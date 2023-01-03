package ai.shelter.shelterbackend.service

import ai.shelter.shelterbackend.entity.Location
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/* generated by ChatGPT */
@SpringBootTest
class LocationServiceTest {
    @Autowired
    lateinit var locationService: LocationService

    @Test
    fun testSaveAndFind() {
        val location = locationService.save(Location(name = "Test location", address = "123 Main St", phone = "123-456-7890"))
        val foundLocation = locationService.findById(location.id!!)
        assertEquals(location, foundLocation)
    }
}
