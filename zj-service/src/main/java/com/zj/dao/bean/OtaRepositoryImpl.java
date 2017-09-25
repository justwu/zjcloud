package com.zj.dao.bean;

import com.zj.dao.local.DaoLocal;
import com.zj.entity.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by flyhigh on 2017/7/10.
 */
@Repository
public class OtaRepositoryImpl {
    @Autowired
    private DaoLocal daoLocal;


    @Cacheable(value = "sections")
    public List<Section> getSections() {
        List<Section> sections = daoLocal.getObjectList("from Section");
        return sections;
    }


    @Cacheable
    public List<Object[]> getChanneldet() {
        return null;
    }


}
