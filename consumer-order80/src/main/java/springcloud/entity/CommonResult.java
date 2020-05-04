package springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public final class CommonResult<T> {
    private Integer code;
    private String status;
    private T result;

    public CommonResult(Integer code,String status){
        this(code,status,null);
    }
}
