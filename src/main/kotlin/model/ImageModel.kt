package model

import org.hibernate.annotations.Generated
import javax.persistence.*

@Entity
@Table(name="image_model")
data class ImageModel(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        val id: Long,

        @Column(name = "name")
        val name: String?,

        @Column(name = "type")
        val type: String?,

        @Lob
        @Column(name="pic")
        val pic: ByteArray
){
    private constructor(): this(-1, "", "", byteArrayOf())
}