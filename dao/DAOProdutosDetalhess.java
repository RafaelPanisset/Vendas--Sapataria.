/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package dao;
//
//import conexoes.ConexaoMySql;
//import java.util.ArrayList;
//import model.ModelDetalhes;
//import model.ModelProduto;
//import model.ModelProdutoDetalhes;
//
///**
// *
// * @author Cliente
// */
//
//
//    public class DAOProdutosDetalhess extends ConexaoMySql {
//
//        public ArrayList<ModelProdutoDetalhes> getProdutoDetalhe() {
//            ArrayList<ModelProdutoDetalhes> listaProdutoDetalhe = new ArrayList<>();
//            ModelProduto modelProduto = new ModelProduto();
//            ModelDetalhes modelDetalheProduto = new ModelDetalhes();
//            ModelProdutoDetalhes modelProdutoDetalhes = new ModelProdutoDetalhes();
//
//            try {
//                this.conectar();
//                this.executarSQL("SELECT "
//                        + "tbl_detalhe_produtos.pk_id_detalhe, "
//                        + "tbl_detalhe_produtos.pk_id_produto, "
//                        + "tbl_detalhe_produtos.tbl_tamanho, "
//                        + "tbl_detalhe_produtos.tbl_imagem, "
//                        + "tbl_detalhe_produtos.tbl_marca, "
//                        + "tbl_detalhe_produtos.tbl_cor, "
//                        + "tbl_detalhe_produtos.tbl_pNome, "
//                        
//                        + "tbl_produto.pk_id_produto, " 
//                        + "tbl_produto.pro_nome, "
//                        + "tbl_produto.pro_valor, "
//                        + "tbl_produto.pro_estoque "
//                      
//                        + " FROM"
//                        + " tbl_detalhe_produtos INNER JOIN tbl_produto "
//                        + "ON tbl_produto.pk_id_produto = tbl_detalhe_produtos.pk_id_produto; "
//                        + ";"
//                );
//
//                while (this.getResultSet().next()) {
//                    modelProdutoDetalhes = new ModelProdutoDetalhes();
//                              
//
//                    modelProduto = new ModelProduto();
//                    modelProduto.setIdProduto(this.getResultSet().getInt(1));
//                    modelProduto.setProNome(this.getResultSet().getString(2));
//                    modelProduto.setProValor(this.getResultSet().getInt(3));
//                    modelProduto.setProEstoque(this.getResultSet().getInt(4));
//
//                    modelDetalheProduto = new ModelDetalhes();
//                    modelDetalheProduto.setPkIdDetalhe(this.getResultSet().getInt(5));
//                    modelDetalheProduto.setPkIdProdutos(this.getResultSet().getInt(6));
//                    modelDetalheProduto.setTblCor(this.getResultSet().getString(7));
//                    modelDetalheProduto.setTblImagem(this.getResultSet().getString(8));
//                    modelDetalheProduto.setTblMarca(this.getResultSet().getString(9));
//                    modelDetalheProduto.setTblTamanho(this.getResultSet().getInt(10));
//                    modelDetalheProduto.setpNome(this.getResultSet().getString(11));
//                  
//
//              
//                    //
//                    modelProdutoDetalhes.setModelProduto(modelProduto);
//                    modelProdutoDetalhes.setModelDetalhes(modelDetalheProduto);
//
//                    listaProdutoDetalhe.add(modelProdutoDetalhes);
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                this.fecharConexao();
//            }
//            return listaProdutoDetalhe;
//        }
//
//    }
//}