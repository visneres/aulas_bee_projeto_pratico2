package com.ambev.pratico2.it;
import com.ambev.pratico2.HerancaPolimorfismo.Cerveja;
import com.ambev.pratico2.HerancaPolimorfismo.Produto;
/*import com.ambev.techempowers.model.Tipo;
import com.ambev.techempowers.model.TipoProduto;*/
import com.ambev.pratico2.MongoDB.repository.ProdutoRepository;
/*import com.ambev.techempowers.repository.TipoProdutoRepository;*/
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;*/
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
/*import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;*/
import org.springframework.test.web.servlet.MockMvc;
/*import org.springframework.test.web.servlet.MvcResult;*/
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/*import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;*/
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ProdutoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ObjectMapper objectMapper;


    @BeforeEach
    public void setUp() {
        // Limpar o banco de dados antes de cada teste
        produtoRepository.deleteAll();
    }
    @Test
    public void testErroBadRequest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/nome/erro")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    public void testGenerico() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/generic")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    public void testCadastrarProdutoEVerificarCadastro() throws Exception {
        Produto cerveja = new Cerveja(
                1,
                "Cerveja de teste",
                5.99,
            true);
        String produtoJson = objectMapper.writeValueAsString(cerveja);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/produtos")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(produtoJson))
                .andExpect(status().isOk());

        // Verifica se o produto foi cadastrado
     /*   Produto produtoCerveja = produtoRepository.findByNome("Cerveja Teste").get(0);
        assert produtoCerveja != null;
        assert produtoCerveja.getNome().equals("Cerveja Teste");*/
    }


}


