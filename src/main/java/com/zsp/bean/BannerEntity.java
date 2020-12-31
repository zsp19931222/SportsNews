package com.zsp.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

/**
 * description:
 * author:created by zsp on 2020/12/24 0024 14:23
 * email:zsp872126510@gmail.com
 */
@Data
public class BannerEntity {
    private int id;
    private String path;
    private String href;
}
