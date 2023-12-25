package com.it.course.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2023-12-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Course implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "course_id", type = IdType.ASSIGN_ID)
    private Long courseId;

    private String courseName;

    private String courseDescription;

    private String courseTeacher;

    private Integer courseCapacity;

    private Date courseTime;


}
