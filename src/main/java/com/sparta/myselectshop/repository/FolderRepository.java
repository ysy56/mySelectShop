package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
