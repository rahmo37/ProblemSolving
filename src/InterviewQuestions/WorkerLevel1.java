package InterviewQuestions;

import java.util.*;

public class WorkerLevel1 {

    private static class Worker {
        String workerId;
        String position;
        String compensation;
        List<Integer> timestamps;

        public Worker(String workerId, String position, String compensation) {
            this.workerId = workerId;
            this.position = position;
            this.compensation = compensation;
            this.timestamps = new ArrayList<>();
        }

        public void registerTime(int timestamp) {
            timestamps.add(timestamp);
        }

        public int getTotalTime() {
            int totalTime = 0;
            for (int i = 0; i < timestamps.size() - 1; i += 2) {
                totalTime += timestamps.get(i + 1) - timestamps.get(i);
            }
            return totalTime;
        }
    }

    public static String[] solution(String[][] queries) {
        Map<String, Worker> workers = new HashMap<>();
        List<String> results = new ArrayList<>();

        for (String[] query : queries) {
            String action = query[0];
            String workerId = query.length > 1 ? query[1] : "";

            switch (action) {
                case "ADD_WORKER":
                    if (workers.containsKey(workerId)) {
                        results.add("false");
                    } else {
                        workers.put(workerId, new Worker(workerId, query[2], query[3]));
                        results.add("true");
                    }
                    break;
                case "REGISTER":
                    int timestamp = Integer.parseInt(query[2]);
                    Worker worker = workers.get(workerId);
                    if (worker == null) {
                        results.add("invalid_request");
                    } else {
                        worker.registerTime(timestamp);
                        results.add("registered");
                    }
                    break;
                case "GET":
                    worker = workers.get(workerId);
                    if (worker == null) {
                        results.add("");
                    } else {
                        results.add(String.valueOf(worker.getTotalTime()));
                    }
                    break;
            }
        }

        return results.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[][] queries = {
                {"ADD_WORKER", "Ashley", "Middle Developer", "150"},
                {"ADD_WORKER", "Ashley", "Junior Developer", "100"},
                {"REGISTER", "Ashley", "10"},
                {"REGISTER", "Ashley", "25"},
                {"GET", "Ashley"},
                {"REGISTER", "Ashley", "40"},
                {"REGISTER", "Ashley", "67"},
                {"REGISTER", "Ashley", "100"},
                {"GET", "Ashley"},
                {"GET", "Walter"},
                {"REGISTER", "Walter", "120"}
        };

        String[] results = solution(queries);
        for (String result : results) {
            System.out.println(result);
        }
    }
}
