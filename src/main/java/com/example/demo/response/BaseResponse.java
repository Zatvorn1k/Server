package com.example.demo.response;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class BaseResponse {//класс позволяющий понять прошла запись
                            //или нет

    protected boolean success;
    protected String message;

}
