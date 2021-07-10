package com.apache.camel.domain;

import lombok.Data;

@Data
public class User {

    private String login;

    private Long id;
    private String node_id;
    private String avatar_url;
    private String url;

}
