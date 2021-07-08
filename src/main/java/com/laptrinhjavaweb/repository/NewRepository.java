package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.laptrinhjavaweb.entity.NewEntity;
// pagkage này tương ứng với tầng - nơi tương tác trực tiếp với DB, thực hiện những câu sql.
// Và để sử dụng đươc những phương thức của JpaRepository thì ta phải cấu hình @EnableJpaRepositories
//trong Class JPAConfig
public interface NewRepository extends JpaRepository<NewEntity, Long>{ // Tham số đầu tiên là lớp mà chúng ta làm việc, tham số thứ 2 là kiểu dữ liệu của khoá chính
}
