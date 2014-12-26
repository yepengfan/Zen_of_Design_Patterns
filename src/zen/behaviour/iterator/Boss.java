package zen.behaviour.iterator;

import java.util.ArrayList;

/**
 * Created by yepengfan on 27/12/14.
 */
public class Boss {
    public static void main(String[] args){
//        ArrayList<IProject> projectList = new ArrayList<IProject>();
        IProject project = new Project();
        project.add("Star Wars", 10, 100000);
        project.add("Twist Space and Time", 100, 10000000);
        project.add("Superman Reform", 10000, 1000000000);
        for(int i = 4; i < 104; i++){
            project.add("The " + i + " project", i * 5, i * 1000000);
        }
        IProjectIterator projectIterator = project.iterator();
        while(projectIterator.hasNext()){
            IProject p = (IProject)projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
