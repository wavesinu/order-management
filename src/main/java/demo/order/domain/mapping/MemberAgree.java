package demo.order.domain.mapping;

import demo.order.domain.Member;
import demo.order.domain.Terms;
import demo.order.domain.common.BaseEntity;
import jakarta.persistence.*;

public class MemberAgree extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "terms_id")
    private Terms terms;
}
