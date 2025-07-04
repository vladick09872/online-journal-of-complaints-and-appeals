package com.example.Keycloak.controller;

import com.example.Keycloak.DTO.ComplaintShortDTO;
import com.example.Keycloak.DTO.UserShortDTO;
import com.example.Keycloak.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Operation(summary = "Get current user", description = "Get info for current user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Current user successfully getting",
                    content = @Content(schema = @Schema(implementation = ComplaintShortDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request data",
                    content = @Content(schema = @Schema()))
    })
    @GetMapping("/me")
    public UserShortDTO getCurrentUser() {
        return userService.getCurrentUser();
    }

    @Operation(summary = "Get all users", description = "Get all users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Users successfully getting",
                    content = @Content(schema = @Schema(implementation = ComplaintShortDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request data",
                    content = @Content(schema = @Schema()))
    })

    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMIN')")
    public List<UserShortDTO> getAllUsers() {
        return userService.findAllUsers();
    }
}
