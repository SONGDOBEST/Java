package day10;

import java.util.Scanner;

public class Z강화 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		while(true) {
		System.out.println("========강화의세계=========");
		System.out.println("1.강화시작 2.강화확률 0. 종료");
		System.out.println("메뉴선택: ");
		int menu = sc.nextInt();

		if (menu == 1) {
			System.out.print("당신이 강화시킬 검의 이름은?: ");
			String name = sc.next();

			while (true) {
				System.out.println("검 이름: " + name);
				System.out.println("현재 강화 수치: " + cnt);
				System.out.println("강화시작(1번을 누르세요");
				int start = sc.nextInt();
				if(start == 1) {
				if (cnt <= 3) {
					double percent = (Math.random() * 10) + 1;
					if (percent <= 9) {
						cnt++;
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("강화에 성공하셨습니다! 현재 강화는 " + cnt + "강 입니다.");
						
					} else {
						if (cnt == 0) {
							try {
								System.out.println("강화중\n");
								Thread.sleep(1000);
							} catch (Exception e) {
								
							}System.out.println("강화에 실패하셨습니다! 현재 강화는 0강 입니다.");
							
						} else {
							cnt--;
							try {
								System.out.println("강화중\n");
								Thread.sleep(1000);
							} catch (Exception e) {
								
							}System.out.println("강화에 실패하셨습니다! 현재 강화는 " + cnt + "강 입니다.");
							
						}
					}
				} else if (cnt <= 7) {
					double percent = (Math.random() * 10) + 1;
					if (percent <= 9) {
						cnt++;
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("강화에 성공하셨습니다! 현재 강화는 " + cnt + "강 입니다.");
						
					} else {
						cnt--;
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("강화에 실패하셨습니다! 현재 강화는 " + cnt + "강 입니다.");
						
					}
				} else if (cnt <= 11) {
					double percent = (Math.random() * 10) + 1;
					if (percent <= 5) {
						cnt++;
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("강화에 성공하셨습니다! 현재 강화는 " + cnt + "강 입니다.");
						
					} else {
						cnt--;
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("강화에 실패하셨습니다! 현재 강화는 " + cnt + "강 입니다.");
						
					}
				} else if (cnt <= 15) {
					double percent = (Math.random() * 20) + 1;
					if (percent <= 9) {
						cnt++;
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("강화에 성공하셨습니다! 현재 강화는 " + cnt + "강 입니다.");
						
					} else if (percent <= 10) {
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ터졌네요ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
						
						cnt = 0;
					} else {
						cnt--;
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("강화에 실패하셨습니다! 현재 강화는 " + cnt + "강 입니다.");
						
					}
				} else {
					double percent = (Math.random() * 20) + 1;
					if (percent <= 6) {
						cnt++;
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("강화에 성공하셨습니다! 현재 강화는 " + cnt + "강 입니다.");
						
					} else if (percent <= 8) {
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋ터졌네요ㅋㅋㅋㅋㅋㅋㅋㅋㅋ아하하하");
						
						cnt = 0;
					} else {
						cnt--;
						try {
							System.out.println("강화중\n");
							Thread.sleep(1000);
						} catch (Exception e) {
							
						}System.out.println("강화에 실패하셨습니다! 현재 강화는 " + cnt + "강 입니다.");
						
					}
				}
				}else {
					break;
				}
			}
		} else if (menu == 2) {
			while(true) {
			System.out.println("<강화확률>");
			System.out.println(
					"~3강 : 성공 90%\n~7강 : 성공 70%\n~11강 성공 50%\n~15강 성공 40%, 파괴 5% \n~20강 성공 30%, 파괴 10%\n실패시 강화 상태 -1");
			break;
			}
			}else {
			System.out.println("강화 종료!");
			break;
		}
	}
	}
}
