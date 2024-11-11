package demo.order.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.order.domain.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long>{

    List<Region> findAllByProvince(String province);
    List<Region> findAllByDistrict(String district);
    Optional<Region> findAllByProvinceAndDistrictAndNeighborhood(String province, String district, String neighborhood);
    Optional<Region> findByCode(String code);

    //boolean existByCode(String code);
}
