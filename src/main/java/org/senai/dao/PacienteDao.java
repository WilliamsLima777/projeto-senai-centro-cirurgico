package org.senai.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.senai.db.conexao;
import org.senai.model.Paciente;

public class PacienteDao {
	
	
	public boolean adicionar(Paciente ObjP) {
		
		
		try {
			
			Connection cont = conexao.conectar();
			
		
			
		
		
	
		//	saida.println("Conexão estabelecida");
			String sql = "insert into paciente (nome, status, sala, inicioprevisto, inicioCirurgia, saidaCirurgia, saidaPrevista)" 
				+ "values ('"+ObjP.getNome()+"','"+ObjP.getStatus()+"','"+ObjP.getLocal()+"','"+ObjP.getInicioPrevisto()+"','"+ObjP.getInicioCirurgia()+"','"+ObjP.getSaidaCirurgia()+"','"+ObjP.getSaidaPrevisto()+"')";
	
	PreparedStatement pst = cont.prepareStatement(sql);
	pst.execute();
	pst.close();
	cont.close();
	
	
	
	
		
			return true;
 
	} catch (Exception e) {
			
		e.printStackTrace();
		}
		
		return false;
	}
	
	public List<Paciente> listaPaciente(){
		List<Paciente> ls = new ArrayList<>();
	try {	
		
		Connection cont = conexao.conectar();
		PreparedStatement pst = cont.prepareStatement("select * from paciente");
		ResultSet rs = pst.executeQuery();
		
		while (rs.next()){
			Paciente p = new Paciente();
			p.setNome(rs.getString("nome"));
			p.setStatus(rs.getString("status"));
			p.setLocal(rs.getString("sala"));
			p.setInicioPrevisto(rs.getString("inicioprevisto"));
			p.setInicioCirurgia(rs.getString("inicioCirurgia"));
			p.setSaidaCirurgia(rs.getString("saidaCirurgia"));
			p.setSaidaPrevisto(rs.getString("saidaPrevista"));
			p.setId(rs.getInt("id"));
			ls.add(p);
			
		}
		
		cont.close();
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}
		
	return ls;
		
	}
	
	
	public Paciente getPaciente(int id) {
		
		
		Paciente p = new Paciente();
		
		
		try {	
			
			Connection cont = conexao.conectar();
			PreparedStatement pst = cont.prepareStatement("select * from paciente where id = ?");
			pst.setInt(1,id);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()){
				
				p.setNome(rs.getString("nome"));
				p.setStatus(rs.getString("status"));
				p.setLocal(rs.getString("sala"));
				p.setInicioPrevisto(rs.getString("inicioprevisto"));
				p.setInicioCirurgia(rs.getString("inicioCirurgia"));
				p.setSaidaCirurgia(rs.getString("saidaCirurgia"));
				p.setSaidaPrevisto(rs.getString("saidaPrevista"));
				p.setId(rs.getInt("id"));
				
				
			}
			
			cont.close();
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return p;
		
	}
	
	public boolean alterar(Paciente objP) {
		
try {
			
			Connection cont = conexao.conectar();
			
		
			
		
		
	
		//	saida.println("Conexão estabelecida");
			String sql = "update paciente set " 
					+ "nome = ?,"
					+ "status = ?,"
					+ "sala = ?,"
					+ "inicioprevisto = ?,"
					+ "inicioCirurgia = ?,"
					+ "saidaCirurgia = ?,"
					+ "saidaPrevista = ?"
					+ "where "
					+ "id   =?";
				
	
	PreparedStatement pst = cont.prepareStatement(sql);
	pst.setString(1,objP.getNome());
	pst.setString(2,objP.getStatus());
	pst.setString(3,objP.getLocal());
	pst.setString(4,objP.getInicioPrevisto());
	pst.setString(5,objP.getInicioCirurgia());
	pst.setString(6,objP.getSaidaCirurgia());
	pst.setString(7,objP.getSaidaPrevisto());
	pst.setInt(8,objP.getId());
	
	pst.execute();
	pst.close();
	cont.close();
	
	
	
	
		
			return true;
 
	} catch (Exception e) {
			
		e.printStackTrace();
		}
		
		return false;
	}
		
	}

