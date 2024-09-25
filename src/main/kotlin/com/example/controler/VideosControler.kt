package com.example.controler

import VideosEntity
import com.example.service.VideosServices
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.slf4j.LoggerFactory

@RestController
@RequestMapping("/api")
class VideosController(private val videosServices: VideosServices) {
    private val logger = LoggerFactory.getLogger(VideosController::class.java)

    @GetMapping("/videos")
    fun getAllVideos(): ResponseEntity<List<VideosEntity>> {
        logger.info("Fetching all videos")
        return try {
            val videos = videosServices.readAllVideos()
            ResponseEntity.ok(videos)
        } catch (e: Exception) {
            logger.error("Error fetching videos", e)
            ResponseEntity.internalServerError().build()
        }
    }
}