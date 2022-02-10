package no.nav.omsorgspenger.omsorgspengerlab.controller

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DebugController {

    @GetMapping
    @ResponseBody
    fun hello(): String {
        return "This is a string"
    }

    @GetMapping("/userId")
    @ResponseBody
    fun getUserId(
        @RegisteredOAuth2AuthorizedClient("client") client: OAuth2AuthorizedClient
    ): String {
        return "This is the userId and client-principalname: ${client.principalName}"
    }

}