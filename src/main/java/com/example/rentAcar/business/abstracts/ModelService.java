package com.example.rentAcar.business.abstracts;

import com.example.rentAcar.business.requests.CreateModelRequest;
import com.example.rentAcar.business.responses.GetAllModelsResponse;

import java.util.*;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);
}
