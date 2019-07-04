package com.demo.mongoDBservice.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quote
{
    @ApiModelProperty(notes="User Name")
    private String name;
    @ApiModelProperty(notes="Quote Name")
    private String quote;
    @Id
    private Integer id;

}
