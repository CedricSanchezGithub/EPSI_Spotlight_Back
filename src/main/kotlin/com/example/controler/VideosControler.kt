package com.example.controler

import VideosEntity
import com.example.service.VideosServices
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")

class VideosControler(val videosServices: VideosServices) {

    @GetMapping("/readallvideos")
    fun readAllRecipes(): List<VideosEntity> {
        println("Appel de la fonction readAllRecipe")
        return videosServices.findAllRecipes()
    }

}