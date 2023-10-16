package com.ambev.pratico2.it;
import com.ambev.pratico2.HerancaPolimorfismo.Cerveja;
import com.ambev.pratico2.HerancaPolimorfismo.Produto;
import com.ambev.pratico2.MongoDB.repository.ProdutoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.junit.jupiter.api.Assertions.assertEquals;
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
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testInternalServerError() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/generic")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is5xxServerError());
    }

    @Test
    public void testCadastrarProdutoEVerificarCadastro() throws Exception {
        Produto cerveja = new Cerveja(
                1,
                "Cerveja de teste",
                5.99,
            true,
                "Budweiser");
        String produtoJson = objectMapper.writeValueAsString(cerveja);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/produtos")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(produtoJson))
                .andExpect(status().isOk());


        // Verifica se o produto foi cadastrado
        com.ambev.pratico2.MongoDB.model.Produto produtoCerveja = produtoRepository.findById("1").get();
        assert produtoCerveja != null;
        assertEquals(produtoCerveja.getNome(), "Budweiser");
    }


}


