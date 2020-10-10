package com.zxelec.componentregister.methodthree;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;
import java.util.function.Predicate;

/**
 * CustomerImportSelector
 *
 * @author vimicro
 * @date 2020/10/10
 */
public class CustomerImportSelector implements ImportSelector {

    /**
     * @param importingClassMetadata 导入的类的信息
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        return new String[]{"com.zxelec.componentregister.methodthree.Melon"};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }
}
