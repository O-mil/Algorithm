import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];
            
            while(true) {
                if (queue.isEmpty()) {  // queue에 아무것도 없음 = 다리에 트럭 없음
                    queue.add(truck);
                    sum += truck;
                    time++; // 다리에 오를 때만 시간 추가
                    break;
                } else if (queue.size() == bridge_length) { // queue에 다리 길이만큼 트럭이 다 찬 경우
                    sum -= queue.poll();
                } else {    // 다리 길이만큼 큐가 차지 않음
                    if (sum + truck <= weight) {    //weight 값을 넘지 않는 선에서 새로운 트럭을 다리에 올리기
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {    // 무게가 넘는다면 0을 넣어서 큐에 들어있는 트럭이 다리를 건너게 함.
                        queue.add(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;    // 마지막 트럭에서 반복문이 끝나는데, 마지막 역시 다리 길이만큼 지나가야 하니까 + 다리길이 해줌.
    }
}