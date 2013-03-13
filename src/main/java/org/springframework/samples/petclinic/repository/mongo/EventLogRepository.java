package org.springframework.samples.petclinic.repository.mongo;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.samples.petclinic.model.mongo.EventLog;

public interface EventLogRepository extends MongoRepository<EventLog, BigInteger> {

}
