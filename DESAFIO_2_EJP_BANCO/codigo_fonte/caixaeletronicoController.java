
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class caixaeletronicoController {

    @FXML
    private Button btinserircartao;
    
    @FXML
    private Button btopscartao;
    
    @FXML
    private VBox telacaixa;
    
    @FXML
    private AnchorPane telainicio;
    
    @FXML
    void inserecartao(ActionEvent event) throws Exception {
       
        operacoes tela3 = new operacoes();
        try
        {
            tela3.start(new Stage());
            mainCaixaEletronico.getStage().close();
            
        }catch(Exception e){e.printStackTrace();}
    }
    
    @FXML
    void opsemcartao(ActionEvent event) {
        
    }
    
    public Button getBtinserircartao() {return btinserircartao;}
    
    public void setBtinserircartao(Button btinserircartao) {this.btinserircartao = btinserircartao;}
        
    public Button getBtopscartao() {return btopscartao;}
        
    public void setBtopscartao(Button btopscartao) {this.btopscartao = btopscartao;}
}