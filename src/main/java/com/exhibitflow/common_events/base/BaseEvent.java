package com.exhibitflow.common_events.base;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class BaseEvent {
  @JsonProperty("event_id")
  public String eventId;

  @JsonProperty("event_type")
  public String eventType;

  @JsonProperty("timestamp")
  public String timestamp;

  @JsonProperty("source_service")
  public String sourceService;
}
