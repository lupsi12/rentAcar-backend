package com.example.rentAcar.webApi.contollers;

import com.example.rentAcar.business.abstracts.ModelService;
import com.example.rentAcar.business.requests.CreateModelRequest;
import com.example.rentAcar.business.responses.GetAllModelsResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {

    private ModelService modelService;

    @GetMapping
    public List<GetAllModelsResponse> getAll(){
        return modelService.getAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateModelRequest createModelRequest) {
        this.modelService.add(createModelRequest);
    }
}
