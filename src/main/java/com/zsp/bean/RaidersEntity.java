package com.zsp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description:
 * author:created by zsp on 2020/12/23 0023 15:23
 * email:zsp872126510@gmail.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RaidersEntity {
    private int raidersId;
    private String raidersImg;
    private String raidersTitle;
    private Integer raidersLike;
    private Integer raidersMessage;
    private Integer raidersLook;
    private String raidersAuthor;
    private String raidersAuthorImg;
    private String raidersTime;
    private String raidersHref;
}
