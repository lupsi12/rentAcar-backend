package com.example.rentAcar.business.concretes;

import com.example.rentAcar.business.abstracts.ModelService;
import com.example.rentAcar.business.requests.CreateModelRequest;
import com.example.rentAcar.business.responses.GetAllModelsResponse;
import com.example.rentAcar.core.utilities.mappers.ModelMapperService;
import com.example.rentAcar.dataAccess.abstracts.ModelRepository;
import com.example.rentAcar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service//bu sınıf bir business nesnesidir
@AllArgsConstructor
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = modelRepository.findAll();

        List<GetAllModelsResponse> modelsResponses = models.stream()
                .map(model -> this.modelMapperService.forResponse()
                        .map(model, GetAllModelsResponse.class)).collect(Collectors.toList());
        return modelsResponses;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
        this.modelRepository.save(model);

    }
}
