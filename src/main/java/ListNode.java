public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static ListNode create(int[] nums) {
		ListNode head = new ListNode(nums[0]);
		ListNode current = head;
		for (int i = 1; i < nums.length; i++) {
			current.next = new ListNode(nums[i]);
			current = current.next;
		}
		return head;
	}

	public static void forEachVal(ListNode head) {
		while (head != null) {
			System.out.printf("%s \t", head.val);
			head = head.next;
		}
	}

	@Override
	public String toString() {
		return "ListNode{" +
			"val=" + val +
			", next=" + next +
			'}';
	}
}
