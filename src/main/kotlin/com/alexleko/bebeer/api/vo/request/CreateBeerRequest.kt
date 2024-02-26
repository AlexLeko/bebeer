package com.alexleko.bebeer.api.vo.request

import java.util.UUID

data class CreateBeerRequest(
        val id: UUID,
        val title: String,
        val producer: String,
        val style: String,
)
