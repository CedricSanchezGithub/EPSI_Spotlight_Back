import jakarta.persistence.*

@Entity
@Table(name = "contenu")
data class VideosEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val lien: String = "",

    @Column(nullable = false)
    val utilisateur: String = "",

    @Column(nullable = false)
    val tags: String = "",

)