import java.util.HashSet;
import java.util.Set;

public class Project {
private String projectname;
private Set<String> teammembers;
private String description;
public Project()
{
	
}
public Project(String projectname,String description)
{
	this.projectname=projectname;
	this.description=description;
	this.teammembers = new HashSet<>();;

}
@Override
public String toString() {
	return "Project [project=" + projectname + ", teammembers=" + teammembers + ", description=" + description + "]";
}
public String getProjectName() {
	return projectname;
}
public void setProject(String project) {
	this.projectname = project;
}
public Set<String> getTeammembers() {
	return teammembers;
}
public void setTeammembers(Set<String> teammembers) {
	this.teammembers = teammembers;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public void addTeamMembers(String memberName) {
    teammembers.add(memberName);
}

}
