package com.imooc.oa.dao;

import com.imooc.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartmentDao {
    //将部门实体类插入到数据库中
    void  insert (Department department);
    //更改部门实体类中的属性
    void  update(Department department);
    //通过id删除
    void  delete(String sn);
    //通过id查询出来 然后封装成 Department对象
    Department select(String sn);
    //将所有记录查到，放在list容器里
    List<Department> selectAll();

}
