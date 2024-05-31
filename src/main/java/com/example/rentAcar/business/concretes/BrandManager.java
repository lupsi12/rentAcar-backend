package com.example.rentAcar.business.concretes;

import com.example.rentAcar.business.abstracts.BrandService;
import com.example.rentAcar.business.requests.CreateBrandRequest;
import com.example.rentAcar.business.requests.UpdateBrandRequest;
import com.example.rentAcar.business.responses.GetAllBrandsResponse;
import com.example.rentAcar.business.responses.GetByIdBrandResponse;
import com.example.rentAcar.business.rules.BrandBusinessRules;
import com.example.rentAcar.core.utilities.mappers.ModelMapperService;
import com.example.rentAcar.dataAccess.abstracts.BrandRepository;
import com.example.rentAcar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service//bu sınıf bir business nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    private BrandBusinessRules brandBusinessRules;
    @Override
    public List<GetAllBrandsResponse> getAll() {
        /*
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> getAllBrandsResponses = new ArrayList<GetAllBrandsResponse>();
        for (Brand brand:brands) {
            GetAllBrandsResponse getAllBrandsResponse = new GetAllBrandsResponse();
            getAllBrandsResponse.setId(brand.getId());
            getAllBrandsResponse.setName(brand.getName());
            getAllBrandsResponses.add(getAllBrandsResponse);
        }
        return getAllBrandsResponses;

         */
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> getAllBrandsResponses = brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());
        return getAllBrandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());

        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);


        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }
    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
        return response;
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }
}
