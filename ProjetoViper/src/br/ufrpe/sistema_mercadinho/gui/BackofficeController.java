package br.ufrpe.sistema_mercadinho.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;.*?>


	@FXML
	private Menu menuMovimentacoes;
	@FXML
	private Menu menuPDV;
	@FXML
	private Menu menuFiscal;
	@FXML
	private Menu menuFinanceiro;
	@FXML
	private Menu menuRelatorios;
	
	
	
	@FXML
	private MenuItem MIC_CadastrarAdministrador;
	@FXML
	private MenuItem MIC_CadastrarFuncionario;
	@FXML
	private MenuItem MIC_CadastrarFornecedor;
	@FXML
	private MenuItem MIC_CadastrarProduto;
	
	
	@FXML
	private MenuItem MIM_AteracoesPrecoDeProduto;
	@FXML
	private MenuItem MIM_ConsultarProdutos;
	@FXML
	private MenuItem MIM_Faturamento;
	@FXML
	private MenuItem MIM_MovimentacaoDeEstoque;
	@FXML
	private MenuItem MIM_PedidoDeCompra;
	@FXML
	private MenuItem MIM_PedidoDeVenda;
	
	
	@FXML
	private MenuItem MIP_FechamentoDeCaixa;
	
	
	@FXML
	private MenuItem MIFiscal_EmissaoDeNotaFiscal;
	@FXML
	private MenuItem MIFiscal_lancarNotaFiscal;
	
	@FXML
	private MenuItem MIFinanceiro_DocumentosAReceber;
	@FXML
	private MenuItem MIFinanceiro_DocumentosAPagar;
	@FXML
	private MenuItem MIFinanceiro_FluxoDeCaixa;
	
	
	@FXML
	private MenuItem MIR_Compras;
	@FXML
	private MenuItem MIR_Fornecedores;
	@FXML
	private MenuItem MIR_Funcionarios;
	@FXML
	private MenuItem MIR_Produtos;
	@FXML
	private MenuItem MIR_Vendas;
	
	private Principal principal;
	
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	
		
	
	
	
	
}
