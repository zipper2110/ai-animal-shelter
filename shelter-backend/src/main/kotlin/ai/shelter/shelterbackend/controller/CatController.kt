package ai.shelter.shelterbackend.controller

import ai.shelter.shelterbackend.entity.Cat
import ai.shelter.shelterbackend.service.CatService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cats")
class CatController {
    @Autowired
    lateinit var catService: CatService

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Cat? {
        return catService.findById(id)
    }

    @PostMapping
    fun create(@RequestBody cat: Cat): Cat {
        return catService.save(cat)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody cat: Cat): Cat {
        cat.id = id
        return catService.save(cat)
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) {
        catService.deleteById(id)
    }
}