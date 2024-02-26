package com.alexleko.bebeer.api.userinterface

import com.alexleko.bebeer.api.vo.request.CreateBeerRequest
import com.alexleko.bebeer.api.vo.request.UpdateBeerRequest
import com.alexleko.bebeer.api.vo.response.BeerResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

interface BeerResourceApi {

    fun create(
            @RequestBody request: CreateBeerRequest,
    ): ResponseEntity<BeerResponse>

    fun retrieve(): ResponseEntity<BeerResponse>

    fun retrieveByTitle(
            @PathVariable("title") title: String,
    ): ResponseEntity<List<BeerResponse>>

    fun update(
            @RequestBody request: UpdateBeerRequest,
    ): ResponseEntity<BeerResponse>

    fun delete(
            @PathVariable("id") id: String,
    ): ResponseEntity<List<BeerResponse>>

}
