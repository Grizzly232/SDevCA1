public class Project {

  private string projectName;
  private DateTime nextDeadline;
  private ArrayList<Employee> collaborators;
  private Image projectImage;
  private string description;

  public string getProjectName() {
    return this.projectName;
  }

  /**
   * 
   * @param projectName
   */
  public void setProjectName(string projectName) {
    this.projectName = projectName;
  }

  public Time getNextDeadline() {
    
  }

  /**
   * 
   * @param nextDeadline
   */
  public void setNextDeadline(Time nextDeadline) {
    
  }

  public String getAttribute() {
    
  }

  /**
   * 
   * @param attribute
   */
  public void setAttribute(String attribute) {
    
  }

  public Image getProjectImage() {
    return this.projectImage;
  }

  /**
   * 
   * @param projectImage
   */
  public void setProjectImage(Image projectImage) {
    this.projectImage = projectImage;
  }

  public string getDescription() {
    return this.description;
  }

  /**
   * 
   * @param description
   */
  public void setDescription(string description) {
    this.description = description;
  }

}