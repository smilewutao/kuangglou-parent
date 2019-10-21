package cn.itsource.kuanggou.vo;

import cn.itsource.kuanggou.domain.Specification;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SkusVO {

    private List<Specification> skuproperties;

    private List<Map<String,String>> skus;
}
