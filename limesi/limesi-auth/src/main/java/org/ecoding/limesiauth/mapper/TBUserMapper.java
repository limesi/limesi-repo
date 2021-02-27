package org.ecoding.limesiauth.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.ecoding.limesiauth.entity.po.TBUser;
import org.ecoding.limesiauth.entity.po.TBUserExample;

public interface TBUserMapper {
    long countByExample(TBUserExample example);

    int deleteByExample(TBUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBUser record);

    int insertSelective(TBUser record);

    List<TBUser> selectByExample(TBUserExample example);

    TBUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBUser record, @Param("example") TBUserExample example);

    int updateByExample(@Param("record") TBUser record, @Param("example") TBUserExample example);

    int updateByPrimaryKeySelective(TBUser record);

    int updateByPrimaryKey(TBUser record);

    int batchInsert(@Param("list") List<TBUser> list);

    int batchInsertSelective(@Param("list") List<TBUser> list, @Param("selective") TBUser.Column ... selective);
}