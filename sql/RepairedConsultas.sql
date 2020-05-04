/*a*/
select placa,nome,estado,marca_nome,modelo_nome,loja_id, ano, preco from veiculos inner join estados on veiculos.estado = estados.sigla;

/*b*/
select marca_nome, modelo_nome, ano, placa, lojas.loja_nome from veiculos join lojas on veiculos.loja_id = lojas.loja_id;

/*c*/
select count(*) from veiculos group by modelo_nome;
select count(*) from veiculos group by marca_nome;

/*d*/
select min(preco), max(preco) from veiculos group by ano;