package com.zj.dao.local;

import com.zj.entity.Sbman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flyhigh on 2017/7/10.
 */
@Service
public interface SbRepository extends JpaRepository<Sbman, Integer> {
    List<Sbman> findSbmanByName(String name);

}
