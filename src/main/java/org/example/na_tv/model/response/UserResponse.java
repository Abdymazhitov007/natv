package org.example.na_tv.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    Long id;
    String fullName;
    String email;
    String phoneNumber;

}
