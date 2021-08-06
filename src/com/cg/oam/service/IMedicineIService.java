package com.cg.oam.service;



import java.util.List;

import com.cg.oam.entities.Medicine;
import com.cg.oam.exception.MedicineNotFoundException;

public interface IMedicineIService {
	public Medicine addMedicine(Medicine medicine);
	public Medicine updateMedicine(Medicine medicine) throws MedicineNotFoundException;
	public Medicine cancelMedicine(int id) throws MedicineNotFoundException;
	public List<Medicine> showAllMedicine(int id);
}
