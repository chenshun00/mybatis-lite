package com.github.mustfun.mybatis.plugin.setting;

import com.intellij.ui.CheckBoxList;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.components.JBTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import lombok.Getter;
import lombok.Setter;

/**
 * @author dengzhiyuan
 * @version 1.0
 * @date 2018/6/13
 * @since 1.0
 */
@Setter
@Getter
public class ConnectDbSetting {

    private JTextField address;
    private JTextField userName;
    private JTextField password;
    private JTextField port;
    private JButton connectButton;
    private JPanel mainPanel;
    private JLabel addressText;
    private JLabel portText;
    private JLabel userNameText;
    private JLabel passwordText;
    private JPanel listPanel;
    private JBScrollPane scrollPaneList;
    private CheckBoxList<String> tableCheckBox;
    private JTextField dbName;
    private JLabel dbNamePanel;
    private JBScrollPane templatePanel;
    private CheckBoxList<Integer> templateCheckbox;
    private JPanel configPanel;
    private JPanel generatePanel;
    private JBLabel tablePrefixLabel;
    private JBTextField tablePrefixInput;
    private JButton daoButton;
    private JBLabel daoLabel;
    private JBTextField daoInput;
    private JBLabel mapperLabel;
    private JBTextField mapperInput;
    private JButton mapperButton;
    private JBLabel poLabel;
    private JBTextField poInput;
    private JButton poButton;
    private JPanel daoPanel;
    private JPanel mapperPanel;
    private JPanel tablePrefixPanel;
    private JPanel poPanel;
    private JBLabel controllerLabel;
    private JBTextField controllerInput;
    private JPanel controllerPanel;
    private JButton controllerButton;
    private JPanel servicePanel;
    private JBTextField serviceInput;
    private JButton serviceButton;
    private JBLabel serviceLabel;
    private JCheckBox poStyle;

    public ConnectDbSetting() {
        port.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int keyChar = e.getKeyChar();
                if (!(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)) {
                    e.consume(); //关键，屏蔽掉非法输入
                }
            }
        });
    }
}
