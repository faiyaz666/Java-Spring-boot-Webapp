package com.example.demospringbootwebapp.Service;

import com.example.demospringbootwebapp.model.RegisterClass;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RegisterService {
    List<RegisterClass> candidateList = new ArrayList();

    public RegisterClass registration(RegisterClass candidate){
        candidateList.add(candidate);
        return candidate;
    }
}
