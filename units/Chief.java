package units;

import java.util.List;

public class Chief extends Unit implements Gun {

    // Constructeur du Chief
    public Chief(String gender, String name) {
        super(gender, name);

    }

    // Méthodes
    public void buffs(List<Unit> unites) {

        System.out.println("applique des buffs aux humains autour de lui");
    }

    public void motivate() {
        System.out.println("Motive les troupes !");
    }

}
