package com.gdn.bbf.blibli.cinta.bumi.repository;

import com.gdn.bbf.blibli.cinta.bumi.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends MongoRepository<Profile, String> {
}
