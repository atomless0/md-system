package com.mdsystemapi.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "TB_PRESCRIPTION")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Prescription {
}
