package edu.ucsb.cs156.example.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

/** 
 * This is a JPA entity that represents a UCSBDate, i.e. an entry
 * that comes from the UCSB API for academic calendar dates.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "ucsbdates")
public class UCSBDate {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String quarterYYYYQ;
  private String name;  
  private LocalDateTime localDateTime;
}