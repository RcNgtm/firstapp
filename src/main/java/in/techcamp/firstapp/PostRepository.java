package in.techcamp.firstapp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PostRepository {
    @Select("select * from posts")
    List<PostEntity> findAll();
}
