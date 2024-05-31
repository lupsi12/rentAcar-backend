package com.example.rentAcar.business.abstracts;

import com.example.rentAcar.business.requests.CreateBrandRequest;
import com.example.rentAcar.business.requests.UpdateBrandRequest;
import com.example.rentAcar.business.responses.GetAllBrandsResponse;
import com.example.rentAcar.business.responses.GetByIdBrandResponse;

import java.util.*;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    GetByIdBrandResponse getById(int id);
    void delete(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
}
