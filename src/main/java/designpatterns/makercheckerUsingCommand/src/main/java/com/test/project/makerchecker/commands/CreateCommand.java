
package designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.commands;


import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.dto.MakerCheckerRequest;
import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.repository.MakerCheckerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("createCommand")
public class CreateCommand extends Command {

    private MakerCheckerRequest request;

    @Autowired
    MakerCheckerRepository makerCheckerRepository;

    public CreateCommand(MakerCheckerRequest request) {
        this.request = request;


    }

    @Override
    public void execute() {
        performAction(request);
    }

    public void performAction(MakerCheckerRequest request) {

        makerCheckerRepository.save(request);
    }
}
