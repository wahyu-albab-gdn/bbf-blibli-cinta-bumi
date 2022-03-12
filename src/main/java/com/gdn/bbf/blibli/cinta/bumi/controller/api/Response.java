package com.gdn.bbf.blibli.cinta.bumi.controller.api.resbody;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response<T> {
    private String status;
    private T data;
}
