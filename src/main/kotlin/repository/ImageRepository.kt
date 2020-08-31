package repository

import model.ImageModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ImageRepository: JpaRepository<ImageModel, Long> {
    fun findByName(name: String) : Optional<ImageModel>
}