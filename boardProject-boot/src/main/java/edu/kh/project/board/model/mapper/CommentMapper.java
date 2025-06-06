package edu.kh.project.board.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.board.model.dto.Comment;

@Mapper 
public interface CommentMapper {

	List<Comment> select(int boardNo);

	int insert(Object comment);

	int delete(int commentNo);

	
	/* 댓글 수정 
	 * 
	 * @Param comment
	 * @return 
	 * 
	 * */
	int update(Object comment);

	

	
}
