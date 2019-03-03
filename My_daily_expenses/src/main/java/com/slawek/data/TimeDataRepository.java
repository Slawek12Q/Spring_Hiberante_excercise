package com.slawek.data;

import com.slawek.model.TimeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TimeDataRepository extends JpaRepository<TimeData, Long>{
}