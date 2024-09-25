import jakarta.persistence.*

@Entity
@Table(name = "contenu")
data class VideosEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val username: String,

    @Column(nullable = false)
    val email: String
)