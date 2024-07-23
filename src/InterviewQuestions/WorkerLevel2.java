package InterviewQuestions;


import java.util.*;
import java.util.stream.Collectors;

public class WorkerLevel2 {

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

        public String getWorkerId() {
            return workerId;
        }
    }

    public static String[] solution(String[][] queries) {
        Map<String, Worker> workers = new HashMap<>();
        List<String> results = new ArrayList<>();

        for (String[] query : queries) {
            String action = query[0];
            switch (action) {
                case "ADD_WORKER":
                    results.add(addWorker(workers, query[1], query[2], query[3]));
                    break;
                case "REGISTER":
                    results.add(register(workers, query[1], Integer.parseInt(query[2])));
                    break;
                case "TOP_N_WORKERS":
                    results.add(topNWorkers(workers, Integer.parseInt(query[1]), query[2]));
                    break;
            }
        }

        return results.toArray(new String[0]);
    }

    private static String addWorker(Map<String, Worker> workers, String workerId, String position, String compensation) {
        if (workers.containsKey(workerId)) {
            return "false";
        } else {
            workers.put(workerId, new Worker(workerId, position, compensation));
            return "true";
        }
    }

    private static String register(Map<String, Worker> workers, String workerId, int timestamp) {
        Worker worker = workers.get(workerId);
        if (worker == null) {
            return "invalid_request";
        } else {
            worker.registerTime(timestamp);
            return "registered";
        }
    }

    private static String topNWorkers(Map<String, Worker> workers, int n, String position) {
        return workers.values().stream()
                .filter(worker -> worker.position.equals(position))
                .sorted(Comparator.comparingInt(Worker::getTotalTime).reversed()
                        .thenComparing(Worker::getWorkerId))
                .limit(n)
                .map(worker -> worker.getWorkerId() + "(" + worker.getTotalTime() + ")")
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[][] queries = {
                {"ADD_WORKER", "John", "Junior Developer", "120"},
                {"ADD_WORKER", "Jason", "Junior Developer", "120"},
                {"ADD_WORKER", "Ashley", "Junior Developer", "120"},
                {"REGISTER", "John", "100"},
                {"REGISTER", "John", "150"},
                {"REGISTER", "Jason", "200"},
                {"REGISTER", "Jason", "250"},
                {"REGISTER", "Jason", "275"},
                {"TOP_N_WORKERS", "5", "Junior Developer"},
                {"TOP_N_WORKERS", "1", "Junior Developer"},
                {"REGISTER", "Ashley", "400"},
                {"REGISTER", "Ashley", "500"},
                {"REGISTER", "Jason", "575"},
                {"TOP_N_WORKERS", "3", "Junior Developer"},
                {"TOP_N_WORKERS", "3", "Middle Developer"}
        };

        String[] results = solution(queries);
        for (String result : results) {
            System.out.println(result);
        }
    }
}
