package com.MedicineApp.Medicine.Application.MedService;

import com.MedicineApp.Medicine.Application.MedRepository.MedRepository;
import com.MedicineApp.Medicine.Application.Model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedServiceImpl implements MedService {
    @Autowired
    MedRepository medRepository;

    @Override
    public boolean addMedicine(Medicine medicine) {
        boolean medicineExists = medRepository.existsByMedicineName(medicine.getMedicineName());

        if (!medicineExists) {
            // Medicine doesn't exist, save it
            medRepository.save(medicine);
            return true;
        } else {
            // Medicine with the same name already exists
            return false;
        }
    }

    @Override
    public Medicine updateMedicine(int medicineId, Medicine updatedMedicine) {
        Medicine existingMedicine = (Medicine) medRepository.findById(medicineId).orElse(null);

        if (existingMedicine != null) {
            existingMedicine.setMedicineName(updatedMedicine.getMedicineName());
            existingMedicine.setPrice(updatedMedicine.getPrice());
            existingMedicine.setQuantity(updatedMedicine.getQuantity());
            existingMedicine.setDescription(updatedMedicine.getDescription());

            return medRepository.save(existingMedicine);
        } else {
            return null;
        }
    }

    @Override
    public List<Medicine> getAllMedicines() {
        return medRepository.findAll();
    }

}
