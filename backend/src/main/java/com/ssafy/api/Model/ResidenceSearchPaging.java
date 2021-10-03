package com.ssafy.api.Model;

import com.ssafy.db.entity.ResidenceInfo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class ResidenceSearchPaging {
    List<ResidenceModel> residenceModels;
    long pageSize;
}
