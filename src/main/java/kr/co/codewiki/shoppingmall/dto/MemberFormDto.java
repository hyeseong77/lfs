package kr.co.codewiki.shoppingmall.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class MemberFormDto {

     // (validated annotation)
     @NotBlank(message = "이름을 입력해주세요.") // null, .length=0, ""
     private String name;

     @NotEmpty(message = "이메일을 입력해주세요.") // null, .length=0
     @Email // 이메일 형식?
     private String email;

     @NotEmpty(message = "비밀번호를 입력해주세요.") // null, .length=0
     @Length(min=3, max=16, message = "3~16자리로 설정해주세요.")
     private String password;

     @NotEmpty(message = "주소를 입력해 주세요.") // null, .length=0
     private String address;

     // 홍팍은 여기다가 toEntity 메소드 만들어서
     // new 해서 파라미터로 저기저거 선언되어져있는 저거 받아와서
     // entity 를 return 해줬었ㅇㅓ

     // 근데!(Member.java)




}
