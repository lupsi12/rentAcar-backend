package com.example.rentAcar.webApi.contollers;

import com.example.rentAcar.business.abstracts.BrandService;
import com.example.rentAcar.business.requests.CreateBrandRequest;
import com.example.rentAcar.business.requests.UpdateBrandRequest;
import com.example.rentAcar.business.responses.GetAllBrandsResponse;
import com.example.rentAcar.business.responses.GetByIdBrandResponse;
import jakarta.servlet.http.PushBuilder;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/brands")//adresleme
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;

    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }
    @PostMapping("/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }
    @GetMapping("/{id}")
    public GetByIdBrandResponse getById(@PathVariable int id){
        return  brandService.getById(id);
    }
    @PutMapping
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest){
        this.brandService.update(updateBrandRequest);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.brandService.delete(id);
    }
}
