import styles from './Components/CohortDetails.module.css';

// dummy data
const dummyCohort = {
  name: 'React Batch A',
  status: 'ongoing',
  startDate: '2025-07-01'
};

function CohortDetails({ cohort = dummyCohort }) {
  return (
    <div className={styles.box}>
      <h3 style={{ color: cohort.status === 'ongoing' ? 'green' : 'blue' }}>
        {cohort.name}
      </h3>
      <dl>
        <dt>Status:</dt>
        <dd>{cohort.status}</dd>
        <dt>Start Date:</dt>
        <dd>{cohort.startDate}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
