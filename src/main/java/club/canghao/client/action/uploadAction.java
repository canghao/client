package club.canghao.client.action;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class uploadAction extends ActionSupport {
	 private static final long serialVersionUID = 1L;
	    private File file; // 提交的文件
	    private String fileFileName; // 提交的 file 的名字
	    private String fileContentType; // 提交的file的类型
	    private Map<String, Object> result=new HashMap<String,Object>();
	    public Map<String, Object> getResult() {
			return result;
		}
		public void setResult(Map<String, Object> result) {
			this.result = result;
		}
		public File getFile() {
	        return file;
	    }
	    public void setFile(File file) {
	        this.file = file;
	    }
	    public String getFileFileName() {
	        return fileFileName;
	    }
	    public void setFileFileName(String fileFileName) {
	        this.fileFileName = fileFileName;
	    }
	    public String getFileContentType() {
	        return fileContentType;
	    }
	    public void setFileContentType(String fileContentType) {
	        this.fileContentType = fileContentType;
	    }
	    // 此处省略三个属性的getter和setter方法
	    public String upload() throws Exception {
	        // 文件输入流
	        InputStream is = new FileInputStream(file);
	        // 设置文件保存的目录
	        String uploadPath = ServletActionContext.getServletContext()
	                .getRealPath("/upload");
	        // 设置目标文件
	        File toFile = new File(uploadPath, this.getFileFileName());
	        // 文件输出流
	        OutputStream os = new FileOutputStream(toFile);
	        byte[] buffer = new byte[1024];
	        int length = 0;
	        // 读取file文件输出到toFile文件中
	        while (-1 != (length = is.read(buffer, 0, buffer.length))) {
	            os.write(buffer);
	        }
	        // 关闭输入流和输出流
	        is.close();
	        os.close();
	        result.clear();
	        result.put("result", true);
	        return SUCCESS;
	    }

}
