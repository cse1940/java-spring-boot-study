package com.springboot.api.dto;

// Dto : 각 클래스 및 인터페이스를 호출하면서 전달하는 매개변수로 사용되는 데이터 객체입니다.
//       데이터를 교환하는 용도로만 사용하므로 별도의 로직이 포함되지 않습니다.
public class MemberDto {
    private String name;
    private String email;
    private String organization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }
}
