/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (8.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ApiResponseDto;
import org.openapitools.model.PetDto;
import java.util.Set;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "pet", description = "Everything about your Pets")
public interface PetApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /pet : Add a new pet to the store
     * 
     *
     * @param petDto Pet object that needs to be added to the store (required)
     * @return successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Add a new pet to the store",
        nickname = "addPet",
        notes = "",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 405, message = "Invalid input")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet",
        consumes = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<Void> addPet(
        @ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody PetDto petDto
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /pet/{petId} : Deletes a pet
     * 
     *
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return successful operation (status code 200)
     *         or Invalid pet value (status code 400)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Deletes a pet",
        nickname = "deletePet",
        notes = "",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid pet value")
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/pet/{petId}"
    )
    
    default ResponseEntity<Void> deletePet(
        @ApiParam(value = "Pet id to delete", required = true) @PathVariable("petId") Long petId,
        @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pet/findByStatus : Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (required)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Finds Pets by status",
        nickname = "findPetsByStatus",
        notes = "Multiple status values can be provided with comma separated strings",
        response = PetDto.class,
        responseContainer = "List",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = PetDto.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/findByStatus",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<List<PetDto>> findPetsByStatus(
        @NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }, { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pet/findByTags : Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (required)
     * @return successful operation (status code 200)
     *         or Invalid tag value (status code 400)
     * @deprecated
     */
    @Deprecated
    @ApiOperation(
        tags = { "pet" },
        value = "Finds Pets by tags",
        nickname = "findPetsByTags",
        notes = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.",
        response = PetDto.class,
        responseContainer = "Set",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = PetDto.class, responseContainer = "Set"),
        @ApiResponse(code = 400, message = "Invalid tag value")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/findByTags",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<Set<PetDto>> findPetsByTags(
        @NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) Set<String> tags
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }, { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pet/{petId} : Find pet by ID
     * Returns a single pet
     *
     * @param petId ID of pet to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Find pet by ID",
        nickname = "getPetById",
        notes = "Returns a single pet",
        response = PetDto.class,
        authorizations = {
            @Authorization(value = "api_key")
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = PetDto.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/{petId}",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<PetDto> getPetById(
        @ApiParam(value = "ID of pet to return", required = true) @PathVariable("petId") Long petId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /pet : Update an existing pet
     * 
     *
     * @param petDto Pet object that needs to be added to the store (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Update an existing pet",
        nickname = "updatePet",
        notes = "",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found"),
        @ApiResponse(code = 405, message = "Validation exception")
    })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/pet",
        consumes = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<Void> updatePet(
        @ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody PetDto petDto
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pet/{petId} : Updates a pet in the store with form data
     * 
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return Invalid input (status code 405)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Updates a pet in the store with form data",
        nickname = "updatePetWithForm",
        notes = "",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 405, message = "Invalid input")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet/{petId}",
        consumes = { "application/x-www-form-urlencoded" }
    )
    
    default ResponseEntity<Void> updatePetWithForm(
        @ApiParam(value = "ID of pet that needs to be updated", required = true) @PathVariable("petId") Long petId,
        @ApiParam(value = "Updated name of the pet") @Valid @RequestParam(value = "name", required = false) String name,
        @ApiParam(value = "Updated status of the pet") @Valid @RequestParam(value = "status", required = false) String status
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pet/{petId}/uploadImage : uploads an image
     * 
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "uploads an image",
        nickname = "uploadFile",
        notes = "",
        response = ApiResponseDto.class,
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = ApiResponseDto.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet/{petId}/uploadImage",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    
    default ResponseEntity<ApiResponseDto> uploadFile(
        @ApiParam(value = "ID of pet to update", required = true) @PathVariable("petId") Long petId,
        @ApiParam(value = "Additional data to pass to server") @Valid @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata,
        @ApiParam(value = "file to upload") @RequestPart(value = "file", required = false) MultipartFile file
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"type\" : \"type\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
