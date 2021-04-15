package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

/*
 *  1. StudentService 인터페이스를 implements하여 클래스 작성
 *  2. loadStudent() method에서
 *     stuedent.txt 파일을 읽어 학생 정보를 추출한 후
 *     List<StudentVO> studentList 에 추가
 *  3. StudentServiceImplV1 생성자에서
 *     loadStudent() 를 호출 자동으로 학생 정보(list) 생성   
 *     
 *  4. getStudent() method에 학생의 학번을 파라메터로 전달하고
 *     studentList에서 해당 학번의 학생을 찾기
 *  5. 학생정보가 있으면 해당 학번 학생의 VO 정보를 return
 *     없으면 null을 return     
 */

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;
	private final int 학번 = 0;
	private final int 이름 = 1;
	private final int 학년 = 2;
	private final int 학과 = 4;
	private final int 주소 = 5;
	
	
	public StudentServiceImplV1() {
		
		studentList = new ArrayList<StudentVO>();
		this.loadStudent();
	}
	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void loadStudent() {
	
		String fileName = "src/com/callor/score/student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			
			while((reader = buffer.readLine()) != null) {
				
				String[] student = reader.split(":");
				StudentVO studentVO = new StudentVO();
				studentVO.setNum(student[학번]);
				studentVO.setName(student[이름]);
				studentVO.setGrade(student[학년]);
				studentVO.setDept(student[학과]);
				studentVO.setAddress(student[주소]);
				studentList.add(studentVO);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다");
		}
	}
	@Override
	public StudentVO getStudent(String num) {
		
		int nSize = studentList.size();
		for(int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
		return null;
	}
	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
		for(StudentVO vo : studentList) {
			System.out.println(vo);
		}
	}
}
