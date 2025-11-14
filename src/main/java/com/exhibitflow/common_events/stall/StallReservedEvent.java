package com.exhibitflow.common_events.stall;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.exhibitflow.common_events.base.BaseEvent;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class StallReservedEvent extends BaseEvent{
  @JsonProperty("reservation_id")
  @NotBlank(message = "Reservation ID is required")
  private String reservationId;

  @JsonProperty("stall_id")
  @NotBlank(message = "Stall ID is required")
  private String stallId;

  @JsonProperty("vendor_id")
  @NotBlank(message = "Vendor ID is required")
  private String vendorId;

  @JsonProperty("vendor_name")
  @NotBlank(message = "Vendor name is required")
  private String vendorName;

  @JsonProperty("vendor_email")
  @NotBlank(message = "Vendor email is required")
  private String vendorEmail;

  @JsonProperty("stall_type")
  @NotBlank(message = "Stall type is required")
  private String stallType;

  @JsonProperty("area_sqm")
  private double areaSqM;

  @JsonProperty("reserved_at")
  @NotNull
  private LocalDateTime reservedAt;

  @JsonProperty("special_instructions")
  private String specialInstructions;

  
}
