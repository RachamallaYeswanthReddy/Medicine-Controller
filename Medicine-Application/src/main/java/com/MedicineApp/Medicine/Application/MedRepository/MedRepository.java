package com.MedicineApp.Medicine.Application.MedRepository;

import com.MedicineApp.Medicine.Application.Model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedRepository extends JpaRepository<Medicine, Integer> {
    Optional<Object> findById(int medicineId);

    Medicine save(Medicine existingMedicine);

    List<Medicine> findAll();

    boolean existsByMedicineName(String medicineName);
}
