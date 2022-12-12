/*
 * Uma forma de ver uma interface é uma classe na qual nada é concreto, ou seja,
 * nao tem nenhum metodo ou atributo. Porém métodos abstratos sao permitidos.
 * 
 * Uma anologia que ajude é pensar na interface como um contrato:
 * 	contrato autenticavel
 * 		quem assina esse contrato, precisa implementar
 * 			-> metodo setSenha
 * 			-> metodo autentica
 * */
public abstract interface Autenticavel  {
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
