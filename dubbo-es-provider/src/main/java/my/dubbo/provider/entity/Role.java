package my.dubbo.provider.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lizy
 * @since 2020-10-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer roletype;

    private String address;


    public static final String NAME = "name";

    public static final String ROLETYPE = "roletype";

    public static final String ADDRESS = "address";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
