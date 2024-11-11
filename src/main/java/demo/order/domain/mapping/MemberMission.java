package demo.order.domain.mapping;

import demo.order.domain.Member;
import demo.order.domain.Mission;
import demo.order.domain.common.BaseEntity;
import jakarta.persistence.*;

public class MemberMission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission;
}
