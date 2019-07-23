//
// Swift4TestAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct Swift4TestAPI {
    /**
     Get all of the models
     - GET /allModels
     - This endpoint tests get a dictionary which contains examples of all of the models.
     - parameter clientId: (query) id that represent the Api client 
     - returns: RequestBuilder<GetAllModelsResult> 
     */
    public func getAllModels(clientId: String) -> RequestBuilder<GetAllModelsResult> {
        let path = "/allModels"
        let parameters = Parameters(
            query: ["client_id": clientId],
            form: nil,
            body: nil)
        return RequestBuilder<GetAllModelsResult>(endpoint: path, method: "GET", parameters: parameters)
    }

}
