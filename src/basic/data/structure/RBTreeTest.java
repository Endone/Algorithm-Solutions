package basic.data.structure;

public class RBTreeTest {

	private static final int a[] = { 10, 40, 30, 60, 90, 70, 20, 50, 80 };
	private static final boolean mDebugInsert = false; // "����"�����ļ�⿪��(false���رգ�true����)
	private static final boolean mDebugDelete = true; // "ɾ��"�����ļ�⿪��(false���رգ�true����)

	public static void main(String[] args) {
		int i, ilen = a.length;
		RBTree<Integer> tree = new RBTree<Integer>();

		System.out.printf("== ԭʼ����: ");
		for (i = 0; i < ilen; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		for (i = 0; i < ilen; i++) {
			tree.Insert(a[i]);
			// ����mDebugInsert=true,����"���Ӻ���"
			if (mDebugInsert) {
				System.out.printf("== ���ӽڵ�: %d\n", a[i]);
				System.out.printf("== ������ϸ��Ϣ: \n");
				tree.print();
				System.out.printf("\n");
			}
		}

		System.out.printf("== ǰ�����: ");
		tree.preOrder();

		System.out.printf("\n== �������: ");
		tree.inOrder();

		System.out.printf("\n== �������: ");
		tree.postOrder();
		System.out.printf("\n");

		System.out.printf("== ��Сֵ: %s\n", tree.Tree_Minimum(tree.root).key);
		System.out.printf("== ���ֵ: %s\n", tree.Tree_Maximum(tree.root).key);
		System.out.printf("== ������ϸ��Ϣ: \n");
		tree.print();
		System.out.printf("\n");

		// ����mDebugDelete=true,����"ɾ������"
		if (mDebugDelete) {
			for (i = 0; i < ilen; i++) {
				tree.delete(a[i]);
				System.out.printf("== ɾ���ڵ�: %d\n", a[i]);
				System.out.printf("== ������ϸ��Ϣ: \n");
				tree.print();
				System.out.printf("\n");
			}
		}

		// ���ٶ�����
		tree.clear();
	}
}