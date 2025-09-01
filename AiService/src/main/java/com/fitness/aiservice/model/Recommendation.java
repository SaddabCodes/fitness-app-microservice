package com.fitness.aiservice.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "recommendation")
@Data
@Builder
public class Recommendation {
}
