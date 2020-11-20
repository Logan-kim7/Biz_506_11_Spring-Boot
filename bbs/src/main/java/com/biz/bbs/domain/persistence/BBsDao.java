package com.biz.bbs.domain.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biz.bbs.domain.BBsVO;


/**
 * JENERIC Dao 와 같은역할 method가 다만들어져있기때문에 
 * 연결만 해주는 역할
 * 
 * 
 * @author 202007291517
 *
 */
public interface BBsDao extends JpaRepository<BBsVO, Long> {

}
