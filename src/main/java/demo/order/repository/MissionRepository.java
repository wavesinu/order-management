package demo.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.order.domain.Mission;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {

}
