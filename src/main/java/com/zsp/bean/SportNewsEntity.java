package com.zsp.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

/**
 * description:
 * author:created by zsp on 2020/12/30 0030 16:55
 * email:zsp872126510@gmail.com
 */
@Data
public class SportNewsEntity {
    private int id;
    private String href;
    private String title;
    private String img;
}
