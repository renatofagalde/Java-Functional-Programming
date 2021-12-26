package br.com.likwi.functionalProgramming.functionalInterface.combinatorPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@ToString
public class Customer  {

    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;
}
