package no.nav.omsorgspenger.rest.controller

import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OmsorgspengerController {
    @Operation(summary = "Hent saker", description = "Henter alle saker.")
    @GetMapping("/omsorgspenger/hentSaker")
    fun hentSaker(): String {
        return "┬─┬ノ( º _ ºノ)"
    }
}