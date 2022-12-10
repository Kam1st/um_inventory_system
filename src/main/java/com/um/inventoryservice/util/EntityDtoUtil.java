package com.um.inventoryservice.util;
/**
 @author Kamilah Hatteea & Brandon Levis : Vet-Service
  * Worked together with (Code with Friends) on IntelliJ IDEA
  * <p>
  * User: @Kamilah Hatteea
  * Date: 2022-09-22
  * Ticket: feat(VVS-CPC-554): edit veterinarian
  * User: Brandon Levis
  * Date: 202
  * Ticket: feat(VVS-CPC-553): add veterinarian
 */

import com.um.inventoryservice.DataLayer.StockItem;
import com.um.inventoryservice.DataLayer.StockItemDTO;
import lombok.Generated;
import org.springframework.beans.BeanUtils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class EntityDtoUtil {
    @Generated
    public EntityDtoUtil(){}

//    public static VetDTO toDTO(Vet vet) {
//        VetDTO dto = new VetDTO();
//        dto.setVetId(vet.getVetId());
//        dto.setVetBillId(vet.getVetBillId());
//        dto.setFirstName(vet.getFirstName());
//        dto.setLastName(vet.getLastName());
//        dto.setEmail(vet.getEmail());
//        dto.setPhoneNumber(vet.getPhoneNumber());
//        dto.setImageId(vet.getImageId());
//        dto.setResume(vet.getResume());
//        dto.setWorkday(vet.getWorkday());
//        dto.setActive(vet.isActive());
//        dto.setSpecialties(toDTOSet(vet.getSpecialties()));
//        return dto;
//    }

    public static StockItem toEntity(StockItemDTO dto) {
        StockItem stockItem = new StockItem();
        stockItem.setStockItemId(generateStockId());
        stockItem.setDescription(dto.getDescription());
        stockItem.setPrice(dto.getPrice());
        stockItem.setSupplierId(dto.getSupplierId());
        stockItem.setSalesQuantity(dto.getSalesQuantity());
        return stockItem;
    }

    public static String generateStockId() {
        Random random = new Random();
        int number = random.nextInt(99999);
        return "22" + (String.format("%05d", number));
    }

    public static StockItemDTO toDTO(StockItem stockItem) {
        StockItemDTO dto = new StockItemDTO();
        BeanUtils.copyProperties(stockItem, dto);
        return dto;
    }
//
//    public static Specialty toEntity(SpecialtyDTO dto) {
//        Specialty specialty = new Specialty();
//        BeanUtils.copyProperties(dto, specialty);
//        return specialty;
//    }
//
//    public static Set<SpecialtyDTO> toDTOSet(Set<Specialty> specialties) {
//        Set<SpecialtyDTO> specialtyDTOS = new HashSet<>();
//        for (Specialty specialty:
//             specialties) {
//            SpecialtyDTO specialtyDTO = toDTO(specialty);
//            specialtyDTOS.add(specialtyDTO);
//        }
//
//        return specialtyDTOS;
//    }
//
//    public static Set<Specialty>  toEntitySet(Set<SpecialtyDTO> specialtyDTOS){
//        Set<Specialty> specialties = new HashSet<>();
//        for (SpecialtyDTO specialtyDTO:
//            specialtyDTOS) {
//            Specialty specialty = toEntity(specialtyDTO);
//            specialties.add(specialty);
//        }
//
//        return specialties;
//    }
//
//    public static String verifyId(String id) {
//        try {
//            Integer.parseInt(id);
//        }
//        catch(NumberFormatException e) {
//            throw new InvalidInputException ("This id is not valid");
//        }
//        return id;
//    }
}
