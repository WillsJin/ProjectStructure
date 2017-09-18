package name.wills.demo.mapper.defaults;

import java.util.List;
import name.wills.demo.mapper.defaults.entity.TIdUser;
import name.wills.demo.mapper.defaults.entity.TIdUserExample;
import org.apache.ibatis.annotations.Param;

public interface TIdUserMapper {
    int countByExample(TIdUserExample example);

    int deleteByExample(TIdUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(TIdUser record);

    int insertSelective(TIdUser record);

    List<TIdUser> selectByExample(TIdUserExample example);

    TIdUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") TIdUser record, @Param("example") TIdUserExample example);

    int updateByExample(@Param("record") TIdUser record, @Param("example") TIdUserExample example);

    int updateByPrimaryKeySelective(TIdUser record);

    int updateByPrimaryKey(TIdUser record);
}