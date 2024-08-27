package cn.gudqs7.plugins.search;

import cn.gudqs7.plugins.common.enums.HttpMethod;
import com.intellij.ide.util.gotoByName.ChooseByNameFilterConfiguration;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import com.intellij.openapi.project.Project;

/**
 * HttpMethodFilterConfiguration
 * @author WQ
 */
@State(name = "CustomMethodFilterConfiguration", storages = @Storage(StoragePathMacros.WORKSPACE_FILE))
public class CustomMethodFilterConfiguration extends ChooseByNameFilterConfiguration<HttpMethod> {

    public static CustomMethodFilterConfiguration getInstance(Project project) {
        return project.getService(CustomMethodFilterConfiguration.class);
    }

    @Override
    protected String nameForElement(HttpMethod type) {
        return type.name();
    }

}
