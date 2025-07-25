package edu.whut.cs.bi.biz.mapper;

import edu.whut.cs.bi.biz.domain.DiseaseDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 病害Mapper接口
 *
 * @author: chenwenqi
 * @date: 2025-04-09
 */
@Mapper
public interface DiseaseDetailMapper {
    /**
     * 查询病害详情列表
     *
     * @param diseaseDetail 病害详情查询条件
     * @return 病害详情集合
     */
    List<DiseaseDetail> selectDiseaseDetailList(DiseaseDetail diseaseDetail);

    /**
     * 根据ID查询病害详情
     *
     * @param id 病害详情ID
     * @return 病害详情
     */
    DiseaseDetail selectDiseaseDetailById(Long id);

    /**
     * 新增病害详情
     *
     * @param diseaseDetail 病害详情
     * @return 结果
     */
    int insertDiseaseDetail(DiseaseDetail diseaseDetail);

    /**
     * 修改病害详情
     *
     * @param diseaseDetail 病害详情
     * @return 结果
     */
    int updateDiseaseDetail(DiseaseDetail diseaseDetail);

    /**
     * 删除病害详情
     *
     * @param id 病害详情ID
     * @return 结果
     */
    int deleteDiseaseDetailById(Long id);

    /**
     * 批量删除病害详情
     *
     * @param ids 需要删除的数据ID数组
     * @return 结果
     */
    int deleteDiseaseDetailByIds(Long[] ids);

    /**
     * 批量新增病害详情
     *
     * @param diseaseDetails 病害详情集合
     * @return 结果
     */
    void insertDiseaseDetails(@Param("diseaseDetails") List<DiseaseDetail> diseaseDetails);
}
