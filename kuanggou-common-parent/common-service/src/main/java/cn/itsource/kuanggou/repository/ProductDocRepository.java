package cn.itsource.kuanggou.repository;


import cn.itsource.kuanggou.client.domain.ProductDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductDocRepository extends ElasticsearchRepository<ProductDoc,Long> {
}
