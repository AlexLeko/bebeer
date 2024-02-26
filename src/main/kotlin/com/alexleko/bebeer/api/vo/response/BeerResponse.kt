package com.alexleko.bebeer.api.vo.response

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
import java.util.UUID

@JsonInclude(NON_NULL)
class BeerResponse(
        val id: UUID,
        val title: String,
        val producer: String,
        val style: String,
)
