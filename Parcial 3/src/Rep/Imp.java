package Rep;

import Model.Asig;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Imp implements Int {

    private List<Asig> asigs;

    public Imp()throws IOException, ClassNotFoundException {
        asigs = new ArrayList<>();
    }

    @Override
    public Asig findByNum(int id) {
         return asigs.stream()
                .filter(local -> local.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Asig> findAll() throws IOException, ClassNotFoundException {
        asigs = (List<Asig>) Ser.reader("Asig.ax");
        return asigs;
    }

    @Override
    public void save(Asig asig) throws IOException {
        this.asigs.add(asig);
        Ser.writer(this.asigs,"Asig.ax");
    }

    @Override
    public void update(Asig asig) throws IOException, ClassNotFoundException {
        Asig oldAsig = findByNum((asig.getId()));
        if (oldAsig != null){
            asigs.remove(oldAsig);
            asigs.add(asig);
        }
        Ser.writer(this.asigs,"Asig.ax");
    }

    @Override
    public void delete(Asig asig) throws IOException {
        asigs.remove(asig);
        Ser.writer(this.asigs,"Asig.ax");
    }
}
