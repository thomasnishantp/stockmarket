package com.digitrader.service;

import com.digitrader.dao.DhanDataDAO;
import com.digitrader.dto.dhan.response.DhanResponseDatumDTO;
import com.digitrader.entity.DhanDataRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class DhanDataService {

    @Autowired
    DhanDataRepository dhanDataRepository;

    public List<DhanDataDAO> getAllNSEData() {
        return dhanDataRepository.findAll();
    }

    public DhanResponseDatumDTO getNSEBySymbol(String symbol) {
        DhanResponseDatumDTO dhanResponseDatumDTO = null;
        DhanDataDAO dataDAO = dhanDataRepository.findBySym(symbol).orElse(null);
        BeanUtils.copyProperties(dataDAO,dhanResponseDatumDTO);
        return dhanResponseDatumDTO;
    }

    public DhanDataDAO saveNSEBySymbol(DhanResponseDatumDTO dhanResponseDatumDTO) {
        Optional<DhanDataDAO> dhanResponseDatum = dhanDataRepository.findBySym(dhanResponseDatumDTO.getSym());
        DhanDataDAO dhanDataDAO = new DhanDataDAO();
            if (dhanResponseDatum.isPresent()) {
                BeanUtils.copyProperties(dhanResponseDatumDTO, dhanDataDAO);
                dhanDataDAO.setId(dhanResponseDatum.get().getId());
                dhanDataDAO.setUpdatedBy("SYSTEM_USER");
                dhanDataDAO.setUpdatedDate(LocalDateTime.now());
                dhanDataDAO.setCreatedBy(dhanResponseDatum.get().getCreatedBy());
                dhanDataDAO.setCreatedDate(dhanResponseDatum.get().getCreatedDate());
                dhanDataDAO.setVersion(dhanResponseDatum.get().getVersion() + 1);
                return dhanDataRepository.save(dhanDataDAO);
            } else {
                BeanUtils.copyProperties(dhanResponseDatumDTO, dhanDataDAO);
                dhanDataDAO.setUpdatedBy("SYSTEM_USER");
                dhanDataDAO.setUpdatedDate(LocalDateTime.now());
                dhanDataDAO.setCreatedBy("SYSTEM_USER");
                dhanDataDAO.setCreatedDate(LocalDateTime.now());
                return dhanDataRepository.save(dhanDataDAO);
            }
    }

    public void deleteNSESymbol(String symbol) {
        dhanDataRepository.deleteBySym(symbol);
    }


}
