package com.alexleko.bebeer.api.vo.request

import org.apache.commons.lang3.StringUtils.EMPTY

data class UpdateBeerRequest(
        val title: String? = EMPTY,
        val producer: String? = EMPTY,
        val style: String? = EMPTY,
)
