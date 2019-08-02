package jdbc;

import java.util.List;

public interface TemplateDAO { // template is class name. can be Person for example
	
	//Best to insert object itself. as can insert all its attributes
	
	public void addTemplate(Template TRef);

	public void updateTemplate(Template TRef);
	
	public List<Template> ListTemplate(); // used to display all records. Use List as fast execution
	
	public void getTemplateById(int id);
	
	public void removeTemplate(int id);
}
