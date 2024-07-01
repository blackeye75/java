package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MidPointOfLL {
	public static Node<Integer> midPoint(Node<Integer> head) {
		if (head == null) {
			return null;
		}
		Node<Integer> fast = head, slow = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static Node<Integer> takeInput() throws IOException {
		Node<Integer> head = null, tail = null;

		String[] datas = br.readLine().trim().split("\\s");

		int i = 0;
		while (i < datas.length && !datas[i].equals("-1")) {
			int data = Integer.parseInt(datas[i]);
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			i += 1;
		}

		return head;
	}

	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			Node<Integer> head = takeInput();

			Node<Integer> mid = midPoint(head);

			if (mid != null) {
				System.out.println(mid.data);
			}

			t -= 1;
		}

	}

}
