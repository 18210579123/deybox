# Mac 电脑启动 Cursor CLI 指南

## 方法一：通过 Cursor 应用安装 CLI（推荐）

1. **打开 Cursor 应用**
   - 启动 Cursor 编辑器

2. **打开命令面板**
   - 按 `Cmd + Shift + P` (macOS)

3. **安装 Shell 命令**
   - 输入并选择：`Shell Command: Install 'cursor' command in PATH`
   - 这会自动将 `cursor` 命令添加到你的 PATH 中

4. **验证安装**
   ```bash
   cursor --version
   ```

## 方法二：手动添加到 PATH

如果方法一不起作用，可以手动添加：

1. **找到 Cursor 可执行文件位置**
   ```bash
   # Cursor 通常安装在以下位置之一：
   /Applications/Cursor.app/Contents/Resources/app/bin/cursor
   ```

2. **创建符号链接或添加到 PATH**
   
   方式 A：创建符号链接到 `/usr/local/bin`
   ```bash
   sudo ln -s /Applications/Cursor.app/Contents/Resources/app/bin/cursor /usr/local/bin/cursor
   ```
   
   方式 B：添加到 shell 配置文件
   ```bash
   # 编辑 ~/.zshrc 或 ~/.bash_profile
   echo 'export PATH="/Applications/Cursor.app/Contents/Resources/app/bin:$PATH"' >> ~/.zshrc
   # 或
   echo 'export PATH="/Applications/Cursor.app/Contents/Resources/app/bin:$PATH"' >> ~/.bash_profile
   
   # 重新加载配置
   source ~/.zshrc
   # 或
   source ~/.bash_profile
   ```

## 使用方法

安装完成后，你可以在终端中使用以下命令：

```bash
# 打开当前目录
cursor .

# 打开指定文件
cursor filename.txt

# 打开指定目录
cursor /path/to/directory

# 打开并跳转到文件的特定行
cursor file.txt:10

# 比较两个文件
cursor --diff file1.txt file2.txt

# 查看帮助
cursor --help
```

## 常见问题

### 如果命令未找到
- 确保 Cursor 应用已正确安装
- 检查 PATH 环境变量是否包含 Cursor 的 bin 目录
- 尝试重启终端

### 权限问题
- 如果遇到权限问题，使用 `sudo` 创建符号链接
- 确保 Cursor.app 有执行权限

## 验证安装

运行以下命令验证 CLI 是否正常工作：

```bash
cursor --version
```

如果显示版本号，说明安装成功！
