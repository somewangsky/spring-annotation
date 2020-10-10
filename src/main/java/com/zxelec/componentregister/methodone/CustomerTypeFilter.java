package com.zxelec.componentregister.methodone;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * CustomerTypeFilter
 * <p>
 * 自定义过滤器
 *
 * @author vimicro
 * @date 2020/10/10
 */
public class CustomerTypeFilter implements TypeFilter {

    /**
     * @param metadataReader        扫描当前类的信息
     * @param metadataReaderFactory 其它类的信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        String className = classMetadata.getClassName();
        // 如果包含BookService则加入到spring容器中
        if (className.contains("BookService")) {
            return true;
        }
        return false;
    }
}
