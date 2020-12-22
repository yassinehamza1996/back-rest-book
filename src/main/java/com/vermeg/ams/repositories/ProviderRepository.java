package com.vermeg.ams.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vermeg.ams.entities.Provider;
@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
}
