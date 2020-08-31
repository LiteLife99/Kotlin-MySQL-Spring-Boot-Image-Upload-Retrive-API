package controller

import model.ImageModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.RequestEntity
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import repository.ImageRepository
import java.util.*

@Controller
@CrossOrigin(origins = arrayOf("http://localhost:4200"))
@RequestMapping("/image")
public class ImageUploadController {

    @Autowired
    lateinit var imageRepository: ImageRepository

    @PostMapping("/upload")
    fun uplaodImage(@RequestParam("imageFile") file: MultipartFile) : ResponseEntity.BodyBuilder {

        println("Original Image Byte Size - " + file.bytes)

        var img = ImageModel(0,file.originalFilename, file.contentType, file.bytes)

        imageRepository.save(img)

        return ResponseEntity.status(HttpStatus.OK)

    }


    @GetMapping("/get/{imageName}")
    fun getImage(@PathVariable("imageName") imageName: String): ImageModel  {

        var retrievedImage: Optional<ImageModel> = imageRepository.findByName(imageName);

        var img: ImageModel = ImageModel(retrievedImage.get().id,retrievedImage.get().name, retrievedImage.get().type, retrievedImage.get().pic)

        return img

    }

}