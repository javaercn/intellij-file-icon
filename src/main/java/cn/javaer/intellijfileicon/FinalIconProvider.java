package cn.javaer.intellijfileicon;


import com.intellij.ide.IconProvider;
import com.intellij.openapi.util.IconLoader;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import javax.swing.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 更改默认图标.
 *
 * @author zhangpeng
 */
public class FinalIconProvider extends IconProvider {

    private static final String CSV_PLUGIN_PSI = "net.seesharpsoft.intellij.plugins.csv.psi.CsvFile";

    @Nullable
    @Override
    public Icon getIcon(@NotNull PsiElement psiElement, int i) {
        if (CSV_PLUGIN_PSI.equals(psiElement.getClass().getName())) {
            return IconLoader.getIcon("/icons/file_type_csv.png");
        }
        PsiFile containingFile = psiElement.getContainingFile();

        if (containingFile != null) {
            String fileName = containingFile.getName().toLowerCase();
            if (fileName.endsWith(".cmd") || fileName.endsWith(".bat")) {
                return IconLoader.getIcon("/icons/file_type_windows.png");
            }
            if (fileName.endsWith(".md")) {
                return IconLoader.getIcon("/icons/MarkdownPlugin.png");
            }
        }
        return null;
    }
}
