package pl.slawek.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.slawek.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}