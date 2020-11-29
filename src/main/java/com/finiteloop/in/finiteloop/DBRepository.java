package com.finiteloop.in.finiteloop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBRepository extends JpaRepository<DB, Long> {
	public DB findById(long a);
}
